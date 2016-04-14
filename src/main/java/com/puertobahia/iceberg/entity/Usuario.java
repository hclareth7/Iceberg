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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Full Stack JavaScrip
 */
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
    private String usuario;
    private String contrasena;
    @OneToOne
    private Empleado empleado;
    @ManyToOne
    private Perfil perfil;
    @OneToOne(fetch = FetchType.LAZY)
    private Zona zona;

}
