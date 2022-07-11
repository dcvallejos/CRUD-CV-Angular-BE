package com.yoprogramo.Proyecto_Final_BE.service;

import com.yoprogramo.Proyecto_Final_BE.model.Experiencia;
import com.yoprogramo.Proyecto_Final_BE.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    @Autowired
    private ExperienciaRepository expRepo;

    @Override
    public List<Experiencia> getExp() {
        List<Experiencia> listaExp = expRepo.findAll();
        return listaExp;    
    }

    @Override
    public void saveExp(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void deleteExp(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia findExp(Long id) {
        Experiencia exp = expRepo.findById(id).orElse(null);
        return exp;
    }

}
