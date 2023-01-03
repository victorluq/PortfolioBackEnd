
package com.vu.backend.controller;

import com.vu.backend.entity.experiencia;
import com.vu.backend.service.Sexperiencia;
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
@RequestMapping("experiencia") //localhost:8080/experiencia
@CrossOrigin(origins = "http://localhost:4200")
public class Cexperiencia {
    
    @Autowired
    Sexperiencia expServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<experiencia> verExperiencia(){
        return expServ.verExperiencia();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public experiencia verExperiencia(@PathVariable int id){
        return expServ.buscarExperiencia(id);
    }

    @PostMapping("/crear")
    /* El "String" es porque va a retornar un String, en caso que
    no retorne nada se pone "void" */
    public String agregarExperiencia (@RequestBody experiencia exp){
        expServ.crearExperiencia(exp);
        return "La experiencia fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarExperiencia(@PathVariable int id){
        expServ.borrarExperiencia(id);
        return "La experiencia se ha borrado correctamente";
    }

    @PutMapping("/editar")
    public String editarExperiencia(@RequestBody experiencia exp){
        expServ.editarExperiencia(exp);
        return "La experiencia fue editada correctamente";
    }
    
}
