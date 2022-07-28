package com.yoprogramo.Proyecto_Final_BE.controller;

import com.yoprogramo.Proyecto_Final_BE.model.Experiencia;
import com.yoprogramo.Proyecto_Final_BE.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExperienciaController {
    @Autowired
    private IExperienciaService interExp;
    
    @GetMapping ("/experiencia")
    public List<Experiencia> getExps(){
        return interExp.getExp();
    }
    
    @GetMapping ("/experiencia/{id}")
    public Experiencia getExpById(@PathVariable Long id){
    return interExp.findExp(id);
    }
    
    @PostMapping ("/experiencia")
    public String createExp(@RequestBody Experiencia exp){
        interExp.saveExp(exp);
        return null;
    }
    
    @DeleteMapping("/experiencia/{id}")
    public String deleteExp (@PathVariable Long id){
        interExp.deleteExp(id);
        return null;
    }
    
    @PutMapping ("/experiencia/{id}")
    public Experiencia editExp (@PathVariable Long id,
                                @RequestBody Experiencia request

                                ){
        Experiencia exp = interExp.findExp(id);
        
        exp.setPuesto(request.getPuesto());
        exp.setEmpresa(request.getEmpresa());
        exp.setPeriodo(request.getPeriodo());
        exp.setPeriodoEnd(request.getPeriodoEnd());
        exp.setTareas(request.getTareas());        
        exp.setLogo(request.getLogo());
        interExp.saveExp(exp);

        
        return exp;
    }
}
