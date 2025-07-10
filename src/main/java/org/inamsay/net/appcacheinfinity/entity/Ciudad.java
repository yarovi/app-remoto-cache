package org.inamsay.net.appcacheinfinity.entity;

import jakarta.persistence.*;

@Table(name = "ciudades")
@Entity
public class Ciudad {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nombre;

  public Ciudad() {
  }

  public Ciudad(Long id, String nombre) {
    this.id = id;
    this.nombre = nombre;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
