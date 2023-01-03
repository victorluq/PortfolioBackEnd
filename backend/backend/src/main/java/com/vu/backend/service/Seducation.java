
package com.vu.backend.service;

import com.vu.backend.entity.education;
import com.vu.backend.repository.Reducation;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class Seducation {
    
    @Autowired
    public Reducation eduRepo;
    
   public List<education> verEducation(){
        List<education> listaEducation = eduRepo.findAll();
        return listaEducation;
    }
    
    public education buscarEducation(int id){
        
        education edu = eduRepo.findById(id).orElse(null);
        return edu;
    }
    
    public void crearEducation(education edu){
        eduRepo.save(edu);
    }
    
    public void borrarEducation(int id){
        eduRepo.deleteById(id);
    }
    
    public void editarEducation(education edu){
        eduRepo.save(edu);
    }
    
}
