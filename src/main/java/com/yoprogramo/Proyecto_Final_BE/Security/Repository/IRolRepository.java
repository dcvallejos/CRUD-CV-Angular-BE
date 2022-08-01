
package com.yoprogramo.Proyecto_Final_BE.Security.Repository;

import com.yoprogramo.Proyecto_Final_BE.Security.Enums.Entity.Rol;
import com.yoprogramo.Proyecto_Final_BE.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);

}
