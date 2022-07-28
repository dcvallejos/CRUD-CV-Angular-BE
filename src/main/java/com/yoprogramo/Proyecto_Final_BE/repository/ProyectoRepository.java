package com.yoprogramo.Proyecto_Final_BE.repository;

import com.yoprogramo.Proyecto_Final_BE.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
    
}
