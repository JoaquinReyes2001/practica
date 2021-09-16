package modelo.dto;
// Generated 15-09-2021 23:35:47 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * EstadoSolicitud generated by hbm2java
 */
public class EstadoSolicitud  implements java.io.Serializable {


     private Integer id;
     private String descripcion;
     private Set incripcions = new HashSet(0);

    public EstadoSolicitud() {
    }

    public EstadoSolicitud(Integer id) {
        this.id = id;
    }

	
    public EstadoSolicitud(String descripcion) {
        this.descripcion = descripcion;
    }
    public EstadoSolicitud(String descripcion, Set incripcions) {
       this.descripcion = descripcion;
       this.incripcions = incripcions;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getIncripcions() {
        return this.incripcions;
    }
    
    public void setIncripcions(Set incripcions) {
        this.incripcions = incripcions;
    }




}

