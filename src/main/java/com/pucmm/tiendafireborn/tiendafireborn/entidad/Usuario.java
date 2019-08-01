package com.pucmm.tiendafireborn.tiendafireborn.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Usuario implements Serializable {
    @Id
    private String usuario;
    private String contraisenia;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String email;

    public Usuario() {

    }

    public Usuario(String usuario, String contraisenia) {
        this.usuario = usuario;
        this.contraisenia = contraisenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraisenia() {
        return contraisenia;
    }

    public void setContraisenia(String contraisenia) {
        this.contraisenia = contraisenia;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
