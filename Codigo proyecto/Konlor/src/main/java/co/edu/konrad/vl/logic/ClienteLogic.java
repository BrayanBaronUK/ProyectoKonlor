/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.logic;

import co.edu.konrad.vl.entities.ClienteEntity;
import co.edu.konrad.vl.persistence.ClientePersistence;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Cesar
 */
public class ClienteLogic {
    
        
    /**
     * Inyección del persistence de cliente
     */
    @Inject 
    private ClientePersistence clientePersistence;
    
    /**
     * Obtener todos los clientes
     * @return Lista clientes
     */
    public List<ClienteEntity> obtenerClientes(){
        List<ClienteEntity> clientes = clientePersistence.findAll();
        return clientes;
    }
    
    /**
     * Obtener un cliente a partir del id
     * @param id
     * @return cliente encontrado
     */
    public ClienteEntity obtenerCliente(Long id){
        ClienteEntity cliente = clientePersistence.find(id);
        if(cliente == null){
            throw new IllegalArgumentException("Cliente no encontrado");
        }
        return cliente;
    }
    
    /**
     * Crear un nuevo cliente
     * @param cliEntity
     * @return estEntity
     */
    public ClienteEntity crearCliente(ClienteEntity cliEntity){
        clientePersistence.create(cliEntity);
        return cliEntity;
    }
    
    /**
     * Actualiza un cliente
     * @param cliEntity
     * @param id
     * @return cliente actualizado
     */
    public ClienteEntity actualizarCliente(Long id, ClienteEntity cliEntity){
        ClienteEntity cliente = clientePersistence.update(cliEntity);
        return cliente;
    }
    
    /**
     * Elimina un cliente
     * @param id 
     */
    public void eliminarCliente(Long id){
        clientePersistence.delete(id);
    }
}
