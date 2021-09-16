package modelo.dto;
// Generated 15-09-2021 23:35:47 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * VideoJuego generated by hbm2java
 */
public class VideoJuego  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String tipoJuego;
     private Set ligas = new HashSet(0);

    public VideoJuego() {
    }

    public VideoJuego(Integer id) {
        this.id = id;
    }

    public VideoJuego(String nombre, String tipoJuego) {
        this.nombre = nombre;
        this.tipoJuego = tipoJuego;
    }
    public VideoJuego(String nombre, String tipoJuego, Set ligas) {
       this.nombre = nombre;
       this.tipoJuego = tipoJuego;
       this.ligas = ligas;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipoJuego() {
        return this.tipoJuego;
    }
    
    public void setTipoJuego(String tipoJuego) {
        this.tipoJuego = tipoJuego;
    }
    public Set getLigas() {
        return this.ligas;
    }
    
    public void setLigas(Set ligas) {
        this.ligas = ligas;
    }




}


