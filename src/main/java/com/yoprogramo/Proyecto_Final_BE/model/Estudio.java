package com.yoprogramo.Proyecto_Final_BE.model;

import javax.persistence.*;
import lombok.*;

@Getter @Setter
@Entity
public class Estudio {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String institucion;
    private String logo;
    private String titulo;
    private String periodo;
    private String periodoEnd;
    private String detalles;
}
