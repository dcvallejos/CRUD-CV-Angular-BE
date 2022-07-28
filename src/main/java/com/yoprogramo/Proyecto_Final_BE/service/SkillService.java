
package com.yoprogramo.Proyecto_Final_BE.service;

import com.yoprogramo.Proyecto_Final_BE.model.Skill;
import com.yoprogramo.Proyecto_Final_BE.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
    @Autowired
    private SkillRepository skillRepo;

    @Override
    public List<Skill> getSkill() {
        List<Skill> listaSkill = skillRepo.findAll();
        return listaSkill;     
    }

    @Override
    public void saveSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill findSkill(Long id) {
        Skill skill = skillRepo.findById(id).orElse(null);
        return skill;
    }

}
