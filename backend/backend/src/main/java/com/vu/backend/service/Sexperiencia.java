package com.vu.backend.service;

import com.vu.backend.entity.experiencia;
import com.vu.backend.repository.Rexperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class Sexperiencia {
    
    @Autowired
    public Rexperiencia expRepo;
    
    public List<experiencia> verExperiencia(){
        List<experiencia> listaExperiencia = expRepo.findAll();
        return listaExperiencia;
    }
    
    public experiencia buscarExperiencia(int id){
        
        experiencia exp = expRepo.findById(id).orElse(null);
        return exp;
    }
    
    public void crearExperiencia(experiencia exp){
        expRepo.save(exp);
    }
    
    public void borrarExperiencia(int id){
        expRepo.deleteById(id);
    }
    
    public void editarExperiencia(experiencia about){
        expRepo.save(about);
    }

    public void editarExperiencia(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
