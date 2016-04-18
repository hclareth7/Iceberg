/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Full Stack JavaScrip
 */
@Entity
@Table(name = "consejos_comunitarios")
public class ConsejoComunitario {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String periodo;
    private String presidente;
    private String contacto;
    @Lob
    private String participantes;
    private int estado;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Zona zona;
    
    
}
