
package com.yoprogramo.Proyecto_Final_BE.service;

import com.yoprogramo.Proyecto_Final_BE.model.Proyecto;
import com.yoprogramo.Proyecto_Final_BE.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    private ProyectoRepository proyRepo;

    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> listaProyecto = proyRepo.findAll();
        return listaProyecto;     
    }

    @Override
    public void saveProyecto(Proyecto proy) {
        proyRepo.save(proy);
    }

    @Override
    public void deleteProyecto(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proy = proyRepo.findById(id).orElse(null);
        return proy;
    }

}
