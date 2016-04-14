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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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
@Table(name = "beneficiarios")
public class Beneficiario implements Serializable {

    @Id
    private Long id;
    private String identificacion;
    private String primer_nombre;
    private String segundo_nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String sexo;
    @Temporal(value = TemporalType.DATE)
    private Date fecha_nacimiento;
    private String direccion;
    private String barrio;
    private String telefono;
    @Lob
    private String datos_ficha;

    @ManyToOne
    private Zona zona;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "beneficiarios_programas",
            joinColumns = {
                @JoinColumn(name = "beneficiarios_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "programas_id")})
    private List<Programa> programas;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "beneficiario", cascade=CascadeType.ALL)
    private List<Asistencia> asistencias;

}
