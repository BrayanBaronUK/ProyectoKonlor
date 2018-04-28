/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.resources;


import co.edu.konrad.vl.dto.clienteDTO;
import co.edu.konrad.vl.entities.ClienteEntity;
import co.edu.konrad.vl.logic.ClienteLogic;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

 /**
 * Recurso/Servicio REST para manejo de Clientes
 * @author Cesar
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/cliente")
public class ClienteResources {   
    @EJB
    private ClienteLogic clienteLogic;
    
    @GET
    public List<clienteDTO> getClienteList(){
        List<ClienteEntity> cliente = clienteLogic.obtenerClientes();
        return clienteDTO.toClienteList(cliente);
    }
    
    @GET
    @Path("{id: \\d+}")
    public clienteDTO getCliente(@PathParam("id") Long id){
        ClienteEntity cliente = clienteLogic.obtenerCliente(id);
        if(cliente == null){
            throw new RuntimeException("El cliente no existe");
        }
        return new clienteDTO(cliente);
    }
    
    @POST
    public clienteDTO createCliente(clienteDTO cliDTO){
        return new clienteDTO(clienteLogic.crearCliente(cliDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public clienteDTO updateCliente(@PathParam("id") Long id, clienteDTO cliDTO ){
       ClienteEntity entity = clienteLogic.obtenerCliente(id);
        if(entity == null){
            throw new RuntimeException("El cliente no existe");
        }
        return new clienteDTO(clienteLogic.actualizarCliente(id, cliDTO.toEntity()));
    }
    
    
    @DELETE
    @Path("clienteId: \\d+}")
    public void deleteCliente(@PathParam("clienteId") Long id){
        ClienteEntity entity = clienteLogic.obtenerCliente(id);
        if(entity == null){
            throw new RuntimeException("El cliente no existe");
        }
        clienteLogic.eliminarCliente(id);
    }
}  

