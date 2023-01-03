
package com.vu.backend.service;

import com.vu.backend.entity.habilidadesBack;
import com.vu.backend.repository.RhabilidadesBack;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ShabilidadesBack {
    
    @Autowired
    public RhabilidadesBack habiliBRepo;
    
    public List<habilidadesBack> verHabilidadesBack(){
        List<habilidadesBack> listaHabilidadesBack = habiliBRepo.findAll();
        return listaHabilidadesBack;
    }
    
    public habilidadesBack buscarHabilidadesBack (int id){
        
        habilidadesBack habiliB = habiliBRepo.findById(id).orElse(null);
        return habiliB;
    }
    
    public void crearHabilidadesBack (habilidadesBack habiliB){
        habiliBRepo.save(habiliB);
    }
    
    public void borrarHabilidadesBack(int id){
        habiliBRepo.deleteById(id);
    }
    
    public void editarHabilidadesBack (habilidadesBack habiliB){
        habiliBRepo.save(habiliB);
    }
}
