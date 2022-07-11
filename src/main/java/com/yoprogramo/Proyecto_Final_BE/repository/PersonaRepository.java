package com.yoprogramo.Proyecto_Final_BE.repository;

import com.yoprogramo.Proyecto_Final_BE.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}
