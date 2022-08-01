
package com.yoprogramo.Proyecto_Final_BE.Security.Service;

import com.yoprogramo.Proyecto_Final_BE.Security.Enums.Entity.Rol;
import com.yoprogramo.Proyecto_Final_BE.Security.Enums.RolNombre;
import com.yoprogramo.Proyecto_Final_BE.Security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired 
    IRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre (RolNombre rolNombre){
    return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
 
    

}
