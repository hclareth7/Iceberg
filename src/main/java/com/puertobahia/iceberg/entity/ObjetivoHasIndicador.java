/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Full Stack JavaScrip
 */
@Entity
@Table(name="objetivos_indicadores")
public class ObjetivoHasIndicador implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
     @ManyToOne(fetch = FetchType.LAZY)
    private Objetivo objetivo;

    @ManyToOne(fetch = FetchType.LAZY)
    private Indicador indicador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    public Indicador getIndicador() {
        return indicador;
    }

    public void setIndicador(Indicador indicador) {
        this.indicador = indicador;
    }

    
    
}
