
package com.vu.backend.controller;

import com.vu.backend.entity.education;
import com.vu.backend.service.Seducation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("education") //localhost:8080/education
@CrossOrigin(origins = "http://localhost:4200")
public class Ceducation {
    
    @Autowired
    Seducation eduServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<education> verEducation(){
        return eduServ.verEducation();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public education verEducation(@PathVariable int id){
        return eduServ.buscarEducation(id);
    }

    @PostMapping("/crear")
    /* El "String" es porque va a retornar un String, en caso que
    no retorne nada se pone "void" */
    public String agregarEducation (@RequestBody education edu){
        eduServ.crearEducation(edu);
        return "La educación fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarEducation(@PathVariable int id){
        eduServ.borrarEducation(id);
        return "La educación se ha borrado correctamente";
    }

    @PutMapping("/editar")
    public String editarEducation(@RequestBody education edu){
        eduServ.editarEducation(edu);
        return "La educación fue editada correctamente";
    }
}
