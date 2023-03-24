
package com.vu.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Date;


@Entity
public class experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   
    @NotNull
    private String imgExp;
        
    private String sizeImg; 
    
    @NotNull
    @Size(min = 1, max = 30, message = "No cumple con la longitud")
    private String puesto;
    
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date inicio; 
    
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date fin; 
          
    @NotNull
    @Size(min = 1, max = 30, message = "No cumple con la longitud")
    private String empresa;
    
    @NotNull
    @Size(min = 1, max = 5000, message = "No cumple con la longitud")
    private String descripcionExp;
    
    
    //constructor
    public experiencia() {
    }

    public experiencia(String imgExp, String sizeImg, String puesto, Date inicio, Date fin, String empresa, String descripcionExp) {
        this.imgExp = imgExp;
        this.sizeImg = sizeImg;
        this.puesto = puesto;
        this.inicio = inicio;
        this.fin = fin;
        this.empresa = empresa;
        this.descripcionExp = descripcionExp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }

    public String getSizeImg() {
        return sizeImg;
    }

    public void setSizeImg(String sizeImg) {
        this.sizeImg = sizeImg;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }
    
    
    
    
    
}
