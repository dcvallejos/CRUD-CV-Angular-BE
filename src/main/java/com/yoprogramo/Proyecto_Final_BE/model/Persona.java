package com.yoprogramo.Proyecto_Final_BE.model;
import javax.persistence.*;
import lombok.*;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE) 
    private Long id;
    private String email;
    private String password;
    private String nombre;
    private String titulo;
    private String about;
    private String foto;
}

