
package com.vu.backend.controller;

import com.vu.backend.entity.aboutme;
import com.vu.backend.service.Saboutme;
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
@RequestMapping("aboutme") //localhost:8080/aboutme
@CrossOrigin(origins = "http://localhost:4200")
public class Caboutme {
    
    @Autowired
    Saboutme aboutServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<aboutme> verAboutme(){
        return aboutServ.verAboutme();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public aboutme verAboutme(@PathVariable int id){
        return aboutServ.buscarAboutme(id);
    }
    
    @PostMapping("/crear")
    /* El "String" es porque va a retornar un String, en caso que
    no retorne nada se pone "void" */
    public String agregarAboutme (@RequestBody aboutme about){
        aboutServ.crearAboutme(about);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarAboutme(@PathVariable int id){
        aboutServ.borrarAboutme(id);
        return "La persona se ha borrado correctamente";
    }

    @PutMapping("/editar")
    public String editarAboutme(@RequestBody aboutme about){
        aboutServ.editarAboutme(about);
        return "La persona fue editada correctamente";
    }
}
