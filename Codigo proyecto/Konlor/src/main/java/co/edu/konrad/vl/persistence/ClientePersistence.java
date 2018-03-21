/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.persistence;

import co.edu.konrad.vl.entities.ClienteEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Cesar chacon
 */
@Stateless
public class ClientePersistence {

    //por cada tabla habra un controller
    @PersistenceContext(unitName = "com.konrad.edu.co_Konlor_war_1.0-SNAPSHOTPU")
    protected EntityManager em;

    //select * from la tabla
    public List<ClienteEntity> findAll() {
        Query todos = em.createQuery("select e from ClienteEntity e");
        return todos.getResultList();
    }

    //obtiene un cliente por su id , por consulta en persistence
    public ClienteEntity find(Long id) {
        ClienteEntity es = em.find(ClienteEntity.class, id);
        return es;
    }

    //insert de datos  metodo persist no retorna
    public ClienteEntity create(ClienteEntity cliente) {
        em.persist(cliente);
        return cliente;

    }

    //actualizar datos , merge si retorna el objeto
    public ClienteEntity update(ClienteEntity clienteActualizar) {
        return em.merge(clienteActualizar);

    }

    public void delete(Long id) {
        ClienteEntity cursoBorrar = em.find(ClienteEntity.class, id);
        em.remove(cursoBorrar);
    }

    public List<ClienteEntity> findByName(String nombre) {

        TypedQuery<ClienteEntity> cliente = em.createNamedQuery("Cliente.findByName", ClienteEntity.class).setParameter("nombre", nombre);
        return cliente.getResultList();
    }
}
