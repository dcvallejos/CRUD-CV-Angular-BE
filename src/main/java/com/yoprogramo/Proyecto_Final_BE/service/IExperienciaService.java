package com.yoprogramo.Proyecto_Final_BE.service;

import com.yoprogramo.Proyecto_Final_BE.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> getExp();
    
    public void saveExp (Experiencia exp);
    
    public void deleteExp (Long id);
    
    public Experiencia findExp (Long id);
    
}
