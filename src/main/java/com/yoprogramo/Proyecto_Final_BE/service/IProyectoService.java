package com.yoprogramo.Proyecto_Final_BE.service;

import com.yoprogramo.Proyecto_Final_BE.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> getProyecto();
    
    public void saveProyecto (Proyecto proyect);
    
    public void deleteProyecto (Long id);
    
    public Proyecto findProyecto (Long id);
    
}
