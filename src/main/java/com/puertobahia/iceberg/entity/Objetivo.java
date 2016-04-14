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
import javax.persistence.Table;

/**
 *
 * @author Full Stack JavaScrip
 */
@Entity
@Table(name = "objetivos")
public class Objetivo implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String descripcion;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "objetivo", cascade=CascadeType.ALL)
    private List<ObjetivoHasIndicador> objetivos_indocadores;


}
