/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Full Stack JavaScrip
 */

@Entity
@Table(name = "programaciones")
public class Programacion implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
    @Temporal(value = TemporalType.DATE)
    private Date fecha;
    private int estado;
    @Lob
    private String observaciones;

    @ManyToOne(fetch = FetchType.LAZY)
    private Actividad actividad;

    @ManyToOne(fetch = FetchType.LAZY)
    private Zona zona;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "programacion", cascade=CascadeType.ALL)
    private List<Asistencia> asistencias;

}
