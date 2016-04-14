/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Full Stack JavaScrip
 */
@Entity
@Table(name = "acciones")
public class Accion implements Serializable {

    @Id
    @GeneratedValue

    private Long id;
    private String nombre;
    private String descripcion;
    @ManyToMany(mappedBy="acciones")
    private List<Perfil> perfiles;




}
