package com.yoprogramo.Proyecto_Final_BE.controller;

import com.yoprogramo.Proyecto_Final_BE.model.Proyecto;
import com.yoprogramo.Proyecto_Final_BE.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProyectoController {
    @Autowired
    private IProyectoService interProy;
    
    @GetMapping ("/proyecto")
    public List<Proyecto> getProyecto(){
        return interProy.getProyecto();
    }
    
    @GetMapping ("/proyecto/{id}")
    public Proyecto getProyectoById(@PathVariable Long id){
    return interProy.findProyecto(id);
    }
    
    @PostMapping ("/proyecto")
    public String createProyecto(@RequestBody Proyecto proy){
        interProy.saveProyecto(proy);
        return null;
    }
    
    @DeleteMapping("/proyecto/{id}")
    public String deleteProyecto (@PathVariable Long id){
        interProy.deleteProyecto(id);
        return null;
    }
    
    @PutMapping ("/proyecto/{id}")
    public Proyecto editProyecto (@PathVariable Long id,
                                @RequestBody Proyecto request

                                ){
        Proyecto proy = interProy.findProyecto(id);
        
        proy.setNombre(request.getNombre());
        proy.setAbout(request.getAbout());
        proy.setPeriodo(request.getPeriodo());
        proy.setLink(request.getLink());        
        proy.setLogo(request.getLogo());
        interProy.saveProyecto(proy);

        
        return proy;
    }
}
