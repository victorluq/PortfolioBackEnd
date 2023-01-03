
package com.vu.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class habilidadesBack {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   
    @NotNull
    private String habilidad;
    
    @NotNull
    private String icono;
    
    @NotNull
    @Size(min = 1, max = 10, message = "No cumple con la longitud")
    private String nivel;
        
    @Min(0)
    @Max(100)
    private String porcentajeProgreso; 

    public habilidadesBack() {
    }

    public habilidadesBack(String habilidad, String icono, String nivel, String porcentajeProgreso) {
        this.habilidad = habilidad;
        this.icono = icono;
        this.nivel = nivel;
        this.porcentajeProgreso = porcentajeProgreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getPorcentajeProgreso() {
        return porcentajeProgreso;
    }

    public void setPorcentajeProgreso(String porcentajeProgreso) {
        this.porcentajeProgreso = porcentajeProgreso;
    }
    
    
}
