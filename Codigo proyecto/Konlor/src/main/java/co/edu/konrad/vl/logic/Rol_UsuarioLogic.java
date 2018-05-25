/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.logic;

import co.edu.konrad.vl.entities.Rol_UsuarioEntity;
import co.edu.konrad.vl.persistence.Rol_UsuarioPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Cesar
 */
@Stateless
public class Rol_UsuarioLogic {
        
    /**
     * Inyección del persistence de Rol_Usuario
     */
    @Inject 
    private Rol_UsuarioPersistence rolPersistence;
    
    /**
     * Obtener todos los Rol_Usuario
     * @return Lista rol_usuario
     */
    public List<Rol_UsuarioEntity> obtenerRol_Usuario(){
        List<Rol_UsuarioEntity> rol_usuario = rolPersistence.findAll();
        return rol_usuario;
    }
    
    /**
     * Obtener un Rol_usuario a partir del id
     * @param id
     * @return rol_usuario encontrado
     */
    public Rol_UsuarioEntity obtenerRol_Usuario(Long id){
        Rol_UsuarioEntity rol_usuario = rolPersistence.find(id);
        if(rol_usuario == null){
            throw new IllegalArgumentException("El Rol de usuario no se ha encontrado");
        }
        return rol_usuario;
    }
    
    /**
     * Crear un nuevo Rol_usuario
     * @param rolEntity
     * @return rolEntity
     */
    public Rol_UsuarioEntity crearRol_Usuario(Rol_UsuarioEntity rolEntity){
        rolPersistence.create(rolEntity);
        return rolEntity;
    }
    
    /**
     * Actualiza un Rol_Usuario
     * @param rolEntity
     * @param id
     * @return rol_usuario actualizado
     */
    public Rol_UsuarioEntity actualizarRol_Usuario(Long id, Rol_UsuarioEntity rolEntity){
        Rol_UsuarioEntity rol_usuario = rolPersistence.update(rolEntity);
        return rol_usuario;
    }
    
    /**
     * Elimina un Rol_Usuario
     * @param id 
     */
    public void eliminarRol_Usuario(Long id){
        rolPersistence.delete(id);
    }
}
