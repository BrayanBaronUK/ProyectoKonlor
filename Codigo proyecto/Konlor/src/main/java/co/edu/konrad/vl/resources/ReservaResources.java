/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.resources;

<<<<<<< HEAD

import co.edu.konrad.vl.dto.ReservaDTO;
import co.edu.konrad.vl.entities.ReservaEntity;
import co.edu.konrad.vl.entities.ReservaEntity;

import co.edu.konrad.vl.logic.ReservaLogic;
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
 * Recurso/Servicio REST para manejo de Reserva
 * @author Cesar
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/reserva")
public class ReservaResources {

 
    @EJB
    private ReservaLogic reservaLogic;
    
    
    @GET
    public List<ReservaDTO> getReservaList(){
        List<ReservaEntity> cadena= reservaLogic.obtenerReserva();
        return ReservaDTO.toReservaList(cadena);
    }
 
    @GET
    @Path("{id: \\d+}")
    public ReservaDTO getReserva(@PathParam("id") Long id){
        ReservaEntity cadena = reservaLogic.obtenerReserva(id);
        if(cadena == null){
            throw new RuntimeException("La reserva no existe");
        }
        return new ReservaDTO(cadena);
    }
    
    @POST
    public ReservaDTO createReserva(ReservaDTO reservaDTO){
        return new ReservaDTO(reservaLogic.crearReserva(reservaDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public ReservaDTO updateReserva(@PathParam("id") Long id, ReservaDTO reservaDTO ){
        ReservaEntity entity = reservaLogic.obtenerReserva(id);
        if(entity == null){
            throw new RuntimeException("La reserva no existe");
        }
        return new ReservaDTO(reservaLogic.actualizarReserva(id, reservaDTO.toEntity()));
    }
    
    
    @DELETE
    @Path("{reservaId: \\d+}")
    public void deleteReserva(@PathParam("reservaId") Long id){
        ReservaEntity entity = reservaLogic.obtenerReserva(id);
        if(entity == null){
            throw new RuntimeException("La reserva no existe");
        }
        reservaLogic.eliminarReserva(id);
    }
}

=======
/**
 *
 * @author Devoto
 */
public class ReservaResources {
    
}
>>>>>>> 82629539ac7f0d0900c0da3323f30dfa5b5f3726
