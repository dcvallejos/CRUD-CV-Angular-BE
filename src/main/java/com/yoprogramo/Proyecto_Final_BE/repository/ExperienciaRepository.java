package com.yoprogramo.Proyecto_Final_BE.repository;
import com.yoprogramo.Proyecto_Final_BE.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
    
}
