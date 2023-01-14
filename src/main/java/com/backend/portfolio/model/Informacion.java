package com.backend.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Informacion {
    
 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String linea1;
    private String linea2;
    private String linea3;
    private String linea4;
    
    public Informacion(){
               
    }
    public Informacion(Long id, String linea1, String linea2, String linea3, String linea4){
        this.id = id;
        this.linea1 = linea1;
        this.linea2 = linea2;
        this.linea3 = linea3;
        this.linea4 = linea4;
        
    }
    
}
