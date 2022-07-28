package com.yoprogramo.Proyecto_Final_BE.model;

import javax.persistence.*;
import lombok.*;

@Getter @Setter
@Entity
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String logo;
    private String about;
    private int periodo;
    private String link;
}
