
package com.vu.backend.controller;

import com.vu.backend.entity.habilidadesSoft;
import com.vu.backend.service.ShabilidadesSoft;
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
@RequestMapping("habilidadesSoft") //localhost:8080/habilidadesSoft
@CrossOrigin(origins = "http://localhost:4200")
public class ChabilidadesSoft {
    
    @Autowired
    ShabilidadesSoft habiliSServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<habilidadesSoft> verHabilidadesSoft(){
        return habiliSServ.verHabilidadesSoft();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public habilidadesSoft verHabilidadesSoft(@PathVariable int id){
        return habiliSServ.buscarHabilidadesSoft(id);
    }

    @PostMapping("/crear")
    /* El "String" es porque va a retornar un String, en caso que
    no retorne nada se pone "void" */
    public String agregarHabilidadesSoft (@RequestBody habilidadesSoft habiliS){
        habiliSServ.crearHabilidadesSoft(habiliS);
        return "La habilidad Soft fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarHabilidadesSoft(@PathVariable int id){
        habiliSServ.borrarHabilidadesSoft(id);
        return "La habilidad Soft se ha borrado correctamente";
    }

    @PutMapping("/editar")
    public String editarHabilidadesSoft(@RequestBody habilidadesSoft habiliS){
        habiliSServ.editarHabilidadesSoft(habiliS);
        return "La habilidad Soft fue editada correctamente";
    }    
    
}
