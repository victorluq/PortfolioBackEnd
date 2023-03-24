
package com.vu.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.validation.constraints.NotNull;
import java.util.Date;


@Entity
public class proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   
    @NotNull
    private String titulo;
    
    @NotNull
    private String descripcion;
    
    @NotNull
    private String imgproyecto;
        
    
    private String urllivedemo; 
    
    
    private String urlrepositorio; 
    
    
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date fecha; 

    public proyectos() {
    }

    public proyectos(String titulo, String descripcion, String imgproyecto, String URLlivedemo, String URLrepositorio, Date fecha) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imgproyecto = imgproyecto;
        this.urllivedemo = URLlivedemo;
        this.urlrepositorio = URLrepositorio;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImgproyecto() {
        return imgproyecto;
    }

    public void setImgproyecto(String imgproyecto) {
        this.imgproyecto = imgproyecto;
    }

    public String getURLlivedemo() {
        return urllivedemo;
    }

    public void setURLlivedemo(String URLlivedemo) {
        this.urllivedemo = URLlivedemo;
    }

    public String getURLrepositorio() {
        return urlrepositorio;
    }

    public void setURLrepositorio(String URLrepositorio) {
        this.urlrepositorio = URLrepositorio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    
}
