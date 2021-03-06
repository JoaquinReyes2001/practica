package modelo.dto;
// Generated 15-09-2021 23:35:47 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PerfilJugador generated by hbm2java
 */
public class PerfilJugador  implements java.io.Serializable {


     private Integer id;
     private TipoJugador tipoJugador;
     private Usuario usuario;
     private String nombre;
     private String correo;
     private String habilidad;
     private Set incripcions = new HashSet(0);
     private Set equipos = new HashSet(0);

    public PerfilJugador() {
    }

    public PerfilJugador(Integer id) {
        this.id = id;
    }

	
    public PerfilJugador(Integer id, TipoJugador tipoJugador, Usuario usuario, String nombre, String correo, String habilidad) {
        this.id = id;
        this.tipoJugador = tipoJugador;
        this.usuario = usuario;
        this.nombre = nombre;
        this.correo = correo;
        this.habilidad = habilidad;
    }
    public PerfilJugador(Integer id, TipoJugador tipoJugador, Usuario usuario, String nombre, String correo, String habilidad, Set incripcions, Set equipos) {
       this.id = id;
       this.tipoJugador = tipoJugador;
       this.usuario = usuario;
       this.nombre = nombre;
       this.correo = correo;
       this.habilidad = habilidad;
       this.incripcions = incripcions;
       this.equipos = equipos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public TipoJugador getTipoJugador() {
        return this.tipoJugador;
    }
    
    public void setTipoJugador(TipoJugador tipoJugador) {
        this.tipoJugador = tipoJugador;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getHabilidad() {
        return this.habilidad;
    }
    
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
    public Set getIncripcions() {
        return this.incripcions;
    }
    
    public void setIncripcions(Set incripcions) {
        this.incripcions = incripcions;
    }
    public Set getEquipos() {
        return this.equipos;
    }
    
    public void setEquipos(Set equipos) {
        this.equipos = equipos;
    }




}


