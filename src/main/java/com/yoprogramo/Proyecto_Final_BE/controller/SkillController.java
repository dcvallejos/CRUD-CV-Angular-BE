package com.yoprogramo.Proyecto_Final_BE.controller;

import com.yoprogramo.Proyecto_Final_BE.model.Skill;
import com.yoprogramo.Proyecto_Final_BE.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SkillController {
    @Autowired
    private ISkillService interSkill;
    
    @GetMapping ("/skill")
    public List<Skill> getSkill(){
        return interSkill.getSkill();
    }
    
    @GetMapping ("/skill/{id}")
    public Skill getSkillById(@PathVariable Long id){
    return interSkill.findSkill(id);
    }
    
    @PostMapping ("/skill")
    public String createSkill(@RequestBody Skill skill){
        interSkill.saveSkill(skill);
        return null;
    }
    
    @DeleteMapping("/skill/{id}")
    public String deleteExp (@PathVariable Long id){
        interSkill.deleteSkill(id);
        return null;
    }
    
    @PutMapping ("/skill/{id}")
    public Skill editSkill (@PathVariable Long id,
                                @RequestBody Skill request

                                ){
        Skill skill = interSkill.findSkill(id);
        
        skill.setNombre(request.getNombre());
        skill.setPuntaje(request.getPuntaje());

        interSkill.saveSkill(skill);

        
        return skill;
    }
}
