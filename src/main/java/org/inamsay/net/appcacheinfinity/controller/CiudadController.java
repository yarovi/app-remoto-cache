package org.inamsay.net.appcacheinfinity.controller;

import org.inamsay.net.appcacheinfinity.entity.Ciudad;
import org.inamsay.net.appcacheinfinity.service.CiudadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ciudades")
public class CiudadController {

  private final CiudadService ciudadService;

  public CiudadController(CiudadService ciudadService) {
    this.ciudadService = ciudadService;
  }

  @GetMapping
  public List<Ciudad> listarCiudades() {
    return ciudadService.obtenerCiudades();
  }
  @GetMapping("/limpiar-cache")
  public String limpiarCache() {
    ciudadService.limpiarCache();
    return "Cache 'ciudadesCache' limpiado.";
  }

}
