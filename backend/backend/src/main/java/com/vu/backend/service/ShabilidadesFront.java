
package com.vu.backend.service;

import com.vu.backend.entity.habilidadesFront;
import com.vu.backend.repository.RhabilidadesFront;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ShabilidadesFront {
    
    @Autowired
    public RhabilidadesFront habiliFRepo;
    
    public List<habilidadesFront> verHabilidadesFront(){
        List<habilidadesFront> listaHabilidadesFront = habiliFRepo.findAll();
        return listaHabilidadesFront;
    }
    
    public habilidadesFront buscarHabilidadesFront(int id){
        
        habilidadesFront habiliF = habiliFRepo.findById(id).orElse(null);
        return habiliF;
    }
    
    public void crearHabilidadesFront(habilidadesFront habiliF){
        habiliFRepo.save(habiliF);
    }
    
    public void borrarHabilidadesFront(int id){
        habiliFRepo.deleteById(id);
    }
    
    public void editarHabilidadesFront(habilidadesFront habiliF){
        habiliFRepo.save(habiliF);
    }
}
