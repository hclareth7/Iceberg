/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Full Stack JavaScrip
 */

@Entity
@Table(name = "empleados")
public class Empleado implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    private String primer_nombre;
    private String segundo_nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String identificacion;
    @Temporal(value=TemporalType.DATE)
    private Date fecha_nacimiento;
    private String telefono;
    private String correo;
    private String direccion;

    @OneToMany(mappedBy = "empleado")
    private List<Usuario> usuarios;



}
