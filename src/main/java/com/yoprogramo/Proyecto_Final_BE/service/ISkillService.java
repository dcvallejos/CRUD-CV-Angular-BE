package com.yoprogramo.Proyecto_Final_BE.service;

import com.yoprogramo.Proyecto_Final_BE.model.Skill;
import java.util.List;


public interface ISkillService {
    
    public List<Skill> getSkill();
    
    public void saveSkill (Skill skill);
    
    public void deleteSkill (Long id);
    
    public Skill findSkill (Long id);
    
}
