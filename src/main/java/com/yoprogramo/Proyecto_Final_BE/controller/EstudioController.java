package com.yoprogramo.Proyecto_Final_BE.controller;

import com.yoprogramo.Proyecto_Final_BE.model.Estudio;
import com.yoprogramo.Proyecto_Final_BE.service.IEstudioService;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import static org.springframework.data.repository.init.ResourceReader.Type.JSON;
import org.springframework.web.bind.annotation.*;

@RestController
public class EstudioController {
        @Autowired
    private IEstudioService interStudy;
    
    @GetMapping ("/estudio")
    public List<Estudio> getStudy(){
        return interStudy.getStudy();
    }
    @GetMapping ("/estudio/{id}")
    public Estudio getsTUDYById(@PathVariable Long id){
    return interStudy.findStudy(id);
    }
    
    @PostMapping ("/estudio")
    public String createStudy(@RequestBody Estudio study){
        interStudy.saveStudy(study);
        return null;
    }
    
    @DeleteMapping("/estudio/{id}")
    public  String deleteStudy (@PathVariable Long id){
        interStudy.deleteStudy(id);
        return  null;
    }
    
    @PutMapping ("/estudio/{id}")
    public Estudio editStudy (@PathVariable Long id,
                                @RequestBody Estudio request

                                ){
        Estudio study = interStudy.findStudy(id);
        
        study.setTitulo(request.getTitulo());
        study.setInstitucion(request.getInstitucion());
        study.setPeriodo(request.getPeriodo());
        study.setLogo(request.getLogo());        
        study.setDetalles(request.getDetalles());
        interStudy.saveStudy(study);

        
        return study;
    }

}
