package com.yoprogramo.Proyecto_Final_BE.model;

import javax.persistence.*;
import lombok.*;

@Getter @Setter
@Entity
public class Skill {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private int puntaje;

}
