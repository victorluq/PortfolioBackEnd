
package com.vu.backend.controller;

import com.vu.backend.entity.habilidadesBack;
import com.vu.backend.service.ShabilidadesBack;
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
@RequestMapping("habilidadesBack") //localhost:8080/habilidadesBack
@CrossOrigin(origins = "http://localhost:4200")
public class ChabilidadesBack {
    
    @Autowired
    ShabilidadesBack habiliBServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<habilidadesBack> verHabilidadesBack(){
        return habiliBServ.verHabilidadesBack();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public habilidadesBack verHabilidadesBack(@PathVariable int id){
        return habiliBServ.buscarHabilidadesBack(id);
    }

    @PostMapping("/crear")
    /* El "String" es porque va a retornar un String, en caso que
    no retorne nada se pone "void" */
    public String agregarHabilidadesBack (@RequestBody habilidadesBack habiliB){
        habiliBServ.crearHabilidadesBack(habiliB);
        return "La habilidad Back fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarHabilidadesBack(@PathVariable int id){
        habiliBServ.borrarHabilidadesBack(id);
        return "La habilidad Back se ha borrado correctamente";
    }

    @PutMapping("/editar")
    public String editarHabilidadesBack(@RequestBody habilidadesBack habiliB){
        habiliBServ.editarHabilidadesBack(habiliB);
        return "La habilidad Back fue editada correctamente";
    }   
    
}
