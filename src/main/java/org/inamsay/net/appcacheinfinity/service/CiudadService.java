package org.inamsay.net.appcacheinfinity.service;

import jakarta.annotation.PostConstruct;
import org.inamsay.net.appcacheinfinity.entity.Ciudad;
import org.inamsay.net.appcacheinfinity.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiudadService {
  private final CiudadRepository ciudadRepository;
  @Autowired
  CacheManager cacheManager;

  public CiudadService(CiudadRepository ciudadRepository) {
    this.ciudadRepository = ciudadRepository;
  }

  @PostConstruct
  public void verificarCache() {
    System.out.println("Nombres de caches disponibles: " + cacheManager.getCacheNames());
  }


  @Cacheable("ciudadesCache")
  public List<Ciudad> obtenerCiudades() {
    System.out.println("Consultando a la base de datos...");
    return ciudadRepository.findAll();
  }
  public void limpiarCache() {
    cacheManager.getCache("ciudadesCache").clear();
    System.out.println("Cache 'ciudadesCache' limpiado.");
  }
}