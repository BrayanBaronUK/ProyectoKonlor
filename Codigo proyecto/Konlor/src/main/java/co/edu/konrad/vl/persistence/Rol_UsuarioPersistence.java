/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.persistence;

import co.edu.konrad.vl.entities.Rol_UsuarioEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Cesar chacon
 */
@Stateless

public class Rol_UsuarioPersistence {

    @PersistenceContext(unitName = "com.konrad.edu.co_Konlor_war_1.0-SNAPSHOTPU")
    protected EntityManager em; // que hacer la trasaccion

    /**
     * meotodo para obtener todos los elementos
     *
     * @return
     */
    public List<Rol_UsuarioEntity> findAll() {
        Query todos = em.createQuery("select ec from Rol_UsuarioEntity ec");
        return todos.getResultList();
    }

    /**
     * obtener un elemento a partir de su id
     *
     * @param id
     * @return elemento encontrado
     */
    public Rol_UsuarioEntity find(Long id) {
        Rol_UsuarioEntity rolFind = em.find(Rol_UsuarioEntity.class, id);
        return rolFind;
    }

    /**
     * Crear un objeto de la entidad Rol_UsuarioEntity
     *
     * @param crearRol
     * @return objeto creado
     */
    public Rol_UsuarioEntity create(Rol_UsuarioEntity crearRol) {
        em.persist(crearRol);
        return crearRol;
    }

    /**
     * Actualizar un objeto de la entidad Rol_UsuarioEntity
     *
     * @param ActualizarRol
     * @return objeto actualizado
     */
    public Rol_UsuarioEntity update(Rol_UsuarioEntity ActualizarRol) {
        return em.merge(ActualizarRol);
    }

    /**
     * Eliminar un Objeto determinado de la entidad Rol_UsuarioEntity
     *
     * @param id
     */
    public void delete(Long id) {
        Rol_UsuarioEntity borrarRol = em.find(Rol_UsuarioEntity.class, id);
        em.remove(borrarRol);
    }

}
