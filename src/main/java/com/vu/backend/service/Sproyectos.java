
package com.vu.backend.service;

import com.vu.backend.entity.proyectos;
import com.vu.backend.repository.Rproyectos;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class Sproyectos {
    
    
    @Autowired
    public Rproyectos proyRepo;
    
   public List<proyectos> verProyectos(){
        List<proyectos> listaProyectos = proyRepo.findAll();
        return listaProyectos;
    }
    
    public proyectos buscarProyectos(int id){
        
        proyectos proy = proyRepo.findById(id).orElse(null);
        return proy;
    }
    
    public void crearProyectos(proyectos proy){
        proyRepo.save(proy);
    }
    
    public void borrarProyectos(int id){
        proyRepo.deleteById(id);
    }
    
    public void editarProyectos(proyectos proy){
        proyRepo.save(proy);
    }
}
