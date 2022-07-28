package com.yoprogramo.Proyecto_Final_BE.service;

import com.yoprogramo.Proyecto_Final_BE.model.Estudio;
import java.util.List;


public interface IEstudioService {
    
    public List<Estudio> getStudy();
    
    public void saveStudy (Estudio study);
    
    public void deleteStudy (Long id);
    
    public Estudio findStudy (Long id);
    
}
