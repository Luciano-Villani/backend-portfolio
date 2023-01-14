package com.backend.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String img_src;
    private String titulo;
    private String descripcion;
    private String periodo;
    
    
    public Experiencia(){
               
    }
    public Experiencia(Long id, String nombre, String apellido){
        this.id = id;
        this.img_src = img_src;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.periodo = periodo;
        
    }
    
}