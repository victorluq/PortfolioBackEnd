
package com.vu.backend.controller;

import com.vu.backend.entity.proyectos;
import com.vu.backend.service.Sproyectos;
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
@RequestMapping("proyectos") //localhost:8080/proyectos
@CrossOrigin(origins = "http://localhost:4200")
public class Cproyectos {
    
    @Autowired
    Sproyectos proyServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<proyectos> verProyectos(){
        return proyServ.verProyectos();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public proyectos verProyectos(@PathVariable int id){
        return proyServ.buscarProyectos(id);
    }
    
    @PostMapping("/crear")
    /* El "String" es porque va a retornar un String, en caso que
    no retorne nada se pone "void" */
    public String agregarProyectos (@RequestBody proyectos proy){
        proyServ.crearProyectos(proy);
        return "El proyecto fue creado correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarProyectos(@PathVariable int id){
        proyServ.borrarProyectos(id);
        return "El proyecto se ha borrado correctamente";
    }

    @PutMapping("/editar")
    public String editarProyectos(@RequestBody proyectos proy){
        proyServ.editarProyectos(proy);
        return "El proyecto fue editado correctamente";
    }
}
