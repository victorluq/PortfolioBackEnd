
package com.vu.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

 
@Entity
public class aboutme {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size(min = 1, max = 30, message = "No cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 30, message = "No cumple con la longitud")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 30, message = "No cumple con la longitud")
    private String profesion;
    
    @NotNull
    private String imgperfil;
          
    @NotNull
    private String descripcion_habilidades;
    
    @NotNull
    private String descripcion_proyectos;
    
    @NotNull
    private String descripcion_contacto;
    
    @NotNull
    private String url_github;
    
    @NotNull
    private String url_linkedin;
    
    @Size(min = 1, max = 5000, message = "No cumple con la longitud")
    private String intro;
    
    @NotNull
    private String cv;
    
    @NotNull
    private String telefono;
    
    @NotNull
    private String email;
    
    @NotNull
    private String ubicacion;

    public aboutme() {
    }

    public aboutme(String nombre, String apellido, String profesion, String imgperfil, String descripcion_habilidades, String descripcion_proyectos, String descripcion_contacto, String url_github, String url_linkedin, String intro, String cv, String telefono, String email, String ubicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.imgperfil = imgperfil;
        this.descripcion_habilidades = descripcion_habilidades;
        this.descripcion_proyectos = descripcion_proyectos;
        this.descripcion_contacto = descripcion_contacto;
        this.url_github = url_github;
        this.url_linkedin = url_linkedin;
        this.intro = intro;
        this.cv = cv;
        this.telefono = telefono;
        this.email = email;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getImgperfil() {
        return imgperfil;
    }

    public void setImgperfil(String imgperfil) {
        this.imgperfil = imgperfil;
    }

    public String getDescripcion_habilidades() {
        return descripcion_habilidades;
    }

    public void setDescripcion_habilidades(String descripcion_habilidades) {
        this.descripcion_habilidades = descripcion_habilidades;
    }

    public String getDescripcion_proyectos() {
        return descripcion_proyectos;
    }

    public void setDescripcion_proyectos(String descripcion_proyectos) {
        this.descripcion_proyectos = descripcion_proyectos;
    }

    public String getDescripcion_contacto() {
        return descripcion_contacto;
    }

    public void setDescripcion_contacto(String descripcion_contacto) {
        this.descripcion_contacto = descripcion_contacto;
    }

    public String getUrl_github() {
        return url_github;
    }

    public void setUrl_github(String url_github) {
        this.url_github = url_github;
    }

    public String getUrl_linkedin() {
        return url_linkedin;
    }

    public void setUrl_linkedin(String url_linkedin) {
        this.url_linkedin = url_linkedin;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
    
     public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    

    
    
    
    
}
