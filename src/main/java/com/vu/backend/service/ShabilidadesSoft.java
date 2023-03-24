
package com.vu.backend.service;

import com.vu.backend.entity.habilidadesSoft;
import com.vu.backend.repository.RhabilidadesSoft;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ShabilidadesSoft {
    
    @Autowired
    public RhabilidadesSoft habiliSRepo;
    
    public List<habilidadesSoft> verHabilidadesSoft(){
        List<habilidadesSoft> listahabilidadesSoft = habiliSRepo.findAll();
        return listahabilidadesSoft;
    }
    
    public habilidadesSoft buscarHabilidadesSoft(int id){
        
        habilidadesSoft habiliS = habiliSRepo.findById(id).orElse(null);
        return habiliS;
    }
    
    public void crearHabilidadesSoft(habilidadesSoft habiliS){
        habiliSRepo.save(habiliS);
    }
    
    public void borrarHabilidadesSoft(int id){
        habiliSRepo.deleteById(id);
    }
    
    public void editarHabilidadesSoft(habilidadesSoft habiliS){
        habiliSRepo.save(habiliS);
    }
}
