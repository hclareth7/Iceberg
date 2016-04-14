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

}
