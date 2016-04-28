/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.entity;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Full Stack JavaScrip
 */
@Entity
@Table(name = "zonas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Zona implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    @Lob
    private String descripcion;
    @JsonManagedReference
    @OneToOne(mappedBy = "zona", fetch = FetchType.LAZY)
    private Usuario usuario;

    @OneToOne(mappedBy = "zona", fetch = FetchType.LAZY)
    private Beneficiario benficiarios;

    @OneToMany(mappedBy = "zona", fetch = FetchType.LAZY)
    List<Programacion> programaciones;
    
    @JsonManagedReference
    @OneToMany(mappedBy = "zona", fetch = FetchType.LAZY)
    List<ConsejoComunitario> consejos_comunitario;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Beneficiario getBenficiarios() {
        return benficiarios;
    }

    public void setBenficiarios(Beneficiario benficiarios) {
        this.benficiarios = benficiarios;
    }

    public List<Programacion> getProgramaciones() {
        return programaciones;
    }

    public void setProgramaciones(List<Programacion> programaciones) {
        this.programaciones = programaciones;
    }

    public List<ConsejoComunitario> getConsejos_comunitario() {
        return consejos_comunitario;
    }

    public void setConsejos_comunitario(List<ConsejoComunitario> consejos_comunitario) {
        this.consejos_comunitario = consejos_comunitario;
    }

}
