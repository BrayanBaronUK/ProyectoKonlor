/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Cesar chacon
 */
@Entity
public class Rol_UsuarioEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * almacena codigo del rol
     */
    @Id//indica que es llave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)
    //sin atributo name queda con el mismo nombre de la clase
    @Column(name = "cod_rol", unique = true, nullable = false)//se define que el atributo esta unico y no puede ser nulo 
    private Long Cod_rol;

    /**
     * almacena rol usuario
     */
    @Column(name = "rol_usuario")
    private String Rol_usuario;

    /**
     * almacena rol cliente
     */
    @Column(name = "rol_cliente")
    private String Rol_cliente;

    @Column
    private String programa;

    public Long getCod_rol() {
        return Cod_rol;
    }

    public void setCod_rol(Long Cod_rol) {
        this.Cod_rol = Cod_rol;
    }

    public String getRol_usuario() {
        return Rol_usuario;
    }

    public void setRol_usuario(String Rol_usuario) {
        this.Rol_usuario = Rol_usuario;
    }

    public String getRol_cliente() {
        return Rol_cliente;
    }

    public void setRol_cliente(String Rol_cliente) {
        this.Rol_cliente = Rol_cliente;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

}
