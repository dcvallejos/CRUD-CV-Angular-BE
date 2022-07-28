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
    private int periodo;
    private int periodoEnd;
    private String tareas;
}
