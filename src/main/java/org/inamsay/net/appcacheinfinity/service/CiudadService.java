package org.inamsay.net.appcacheinfinity.service;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.Cacheable;
import org.inamsay.net.appcacheinfinity.entity.Ciudad;
import org.inamsay.net.appcacheinfinity.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;

import java.util.List;

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


  @Cacheable("ciudades")
  public List<Ciudad> obtenerCiudades() {
    System.out.println("Consultando a la base de datos...");
    return ciudadRepository.findAll();
  }
}