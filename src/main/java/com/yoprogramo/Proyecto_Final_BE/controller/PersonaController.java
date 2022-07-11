package com.yoprogramo.Proyecto_Final_BE.controller;

import com.yoprogramo.Proyecto_Final_BE.model.Persona;
import com.yoprogramo.Proyecto_Final_BE.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping ("/personas")
    public List<Persona> getPersonas(){
        return interPersona.getPersonas();
    }
    
    @PostMapping ("/personas/crear")
    public String createUser(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        return "El usuario fue creado correctamente";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona (@PathVariable Long id){
        interPersona.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping ("/personas/editar/{id}")
    public Persona editPersona (@PathVariable Long id,
                                @RequestBody Persona request

                                ){
        Persona perso = interPersona.findPersona(id);
        
        perso.setNombre(request.getNombre());
        perso.setTitulo(request.getTitulo());
        perso.setAbout(request.getAbout());
        perso.setFoto(request.getFoto());
        
        interPersona.savePersona(perso);

        
        return perso;
    }

}
