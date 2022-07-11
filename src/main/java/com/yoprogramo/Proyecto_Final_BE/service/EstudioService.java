
package com.yoprogramo.Proyecto_Final_BE.service;

import com.yoprogramo.Proyecto_Final_BE.model.Estudio;
import com.yoprogramo.Proyecto_Final_BE.repository.EstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioService implements IEstudioService{
    @Autowired
    private EstudioRepository estRepo;

    @Override
    public List<Estudio> getStudy() {
        List<Estudio> listaStudy = estRepo.findAll();
        return listaStudy;     
    }

    @Override
    public void saveStudy(Estudio study) {
        estRepo.save(study);
    }

    @Override
    public void deleteStudy(Long id) {
        estRepo.deleteById(id);
    }

    @Override
    public Estudio findStudy(Long id) {
        Estudio est = estRepo.findById(id).orElse(null);
        return est;
    }

}
