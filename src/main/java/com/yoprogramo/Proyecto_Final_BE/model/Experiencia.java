package com.yoprogramo.Proyecto_Final_BE.model;
import javax.persistence.*;
import lombok.*;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)    
    private Long id;
    private String puesto;
    private String logo;
    private String empresa;
    private String periodo;
    private String periodoEnd;
    private String tareas;
    private int index;
}
