
package com.vu.backend.service;

import com.vu.backend.entity.aboutme;
import com.vu.backend.repository.Raboutme;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class Saboutme {
    
    @Autowired
    public Raboutme aboutmeRepo;
   
    public List<aboutme> verAboutme(){
        List<aboutme> listaAboutme = aboutmeRepo.findAll();
        return listaAboutme;
    }
    
    public aboutme buscarAboutme(int id){
        aboutme about = aboutmeRepo.findById(id).orElse(null);
        return about;
    }
    
    public void crearAboutme(aboutme about){
        aboutmeRepo.save(about);
    }
    
    public void borrarAboutme(int id){
        aboutmeRepo.deleteById(id);
    }
    
    public void editarAboutme(aboutme about){
        aboutmeRepo.save(about);
    }

   
}
