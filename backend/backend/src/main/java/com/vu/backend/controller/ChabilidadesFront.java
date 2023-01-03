
package com.vu.backend.controller;

import com.vu.backend.entity.habilidadesFront;
import com.vu.backend.service.ShabilidadesFront;
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
@RequestMapping("habilidadesFront") //localhost:8080/habilidadesF
@CrossOrigin(origins = "http://localhost:4200")
public class ChabilidadesFront {
    
    @Autowired
    ShabilidadesFront habiliFServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<habilidadesFront> verHabilidadesFront(){
        return habiliFServ.verHabilidadesFront();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public habilidadesFront verHabilidadesFront(@PathVariable int id){
        return habiliFServ.buscarHabilidadesFront(id);
    }

    @PostMapping("/crear")
    /* El "String" es porque va a retornar un String, en caso que
    no retorne nada se pone "void" */
    public String agregarHabilidadesFront (@RequestBody habilidadesFront habiliF){
        habiliFServ.crearHabilidadesFront(habiliF);
        return "La habilidad Front fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarHabilidadesFront(@PathVariable int id){
        habiliFServ.borrarHabilidadesFront(id);
        return "La habilidad Front se ha borrado correctamente";
    }

    @PutMapping("/editar")
    public String editarHabilidadesFront(@RequestBody habilidadesFront habiliF){
        habiliFServ.editarHabilidadesFront(habiliF);
        return "La habilidad Front fue editada correctamente";
    }    
}
