package org.inamsay.net.appcacheinfinity.entity;

import jakarta.persistence.*;

@Table(name = "ciudades")
@Entity
public class Ciudad {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nombre;

}
