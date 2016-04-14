/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Full Stack JavaScrip
 */
@Entity
@Table(name = "zonas")
public class Zona implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String descripcion;

    @OneToOne(mappedBy = "zona")
    private Usuario usuario;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "zona", cascade = CascadeType.ALL)
    private Beneficiario benficiarios;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "zona")
    List<Programacion> programaciones;

}
