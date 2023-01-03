
package com.vu.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Date;

@Entity
public class education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   
    @NotNull
    private String imgEdu;
        
    
    private String sizeImg; 
    
    @NotNull
    @Size(min = 1, max = 30, message = "No cumple con la longitud")
    private String titulo;
    
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date inicio; 
    
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date fin; 
          
    @NotNull
    @Size(min = 1, max = 30, message = "No cumple con la longitud")
    private String institucion;
    
    @NotNull
    @Size(min = 1, max = 5000, message = "No cumple con la longitud")
    private String descripcionEdu;
            
            
    //constructores
    
    public education() {
    }

    public education(String imgEdu, String sizeImg, String titulo, Date inicio, Date fin, String institucion, String descripcionEdu) {
        this.imgEdu = imgEdu;
        this.sizeImg = sizeImg;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.institucion = institucion;
        this.descripcionEdu = descripcionEdu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgEdu() {
        return imgEdu;
    }

    public void setImgEdu(String imgEdu) {
        this.imgEdu = imgEdu;
    }

    public String getSizeImg() {
        return sizeImg;
    }

    public void setSizeImg(String sizeImg) {
        this.sizeImg = sizeImg;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    

    
    
    
}
