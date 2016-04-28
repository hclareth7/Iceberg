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
@Table(name = "indicadores")
public class Indicador implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "indicador", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ObjetivoHasIndicador> objetivos_indocadores;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<ObjetivoHasIndicador> getObjetivos_indocadores() {
        return objetivos_indocadores;
    }

    public void setObjetivos_indocadores(List<ObjetivoHasIndicador> objetivos_indocadores) {
        this.objetivos_indocadores = objetivos_indocadores;
    }
    
    
}
