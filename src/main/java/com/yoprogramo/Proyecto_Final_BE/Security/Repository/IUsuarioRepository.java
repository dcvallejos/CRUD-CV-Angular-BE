
package com.yoprogramo.Proyecto_Final_BE.Security.Repository;

import com.yoprogramo.Proyecto_Final_BE.Security.Repository.*;
import com.yoprogramo.Proyecto_Final_BE.Security.Enums.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);

boolean existsByNombreUsuario(String nombreUsuario);   
boolean existsByEmail(String email);
}
