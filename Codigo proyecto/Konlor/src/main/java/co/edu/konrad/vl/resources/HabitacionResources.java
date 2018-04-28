/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.resources;

<<<<<<< HEAD

import co.edu.konrad.vl.dto.HabitacionDTO;

import co.edu.konrad.vl.entities.HabitacionEntity;

import co.edu.konrad.vl.logic.HabitacionLogic;
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
 * Recurso/Servicio REST para manejo de Habitacion
 * @author Cesar
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/habitacion")
public class HabitacionResources {
 
 
    @EJB
    private HabitacionLogic habitacionLogic;
    
    
    @GET
    public List<HabitacionDTO> getHabitacionList(){
        List<HabitacionEntity> cadena= habitacionLogic.obtenerHabitacion();
        return HabitacionDTO.toHabitacionList(cadena);
    }
 
    @GET
    @Path("{id: \\d+}")
    public HabitacionDTO getHabitacion(@PathParam("id") Long id){
        HabitacionEntity cadena = habitacionLogic.obtenerHabitacion(id);
        if(cadena == null){
            throw new RuntimeException("La habitacion no existe");
        }
        return new HabitacionDTO(cadena);
    }
    
    @POST
    public HabitacionDTO createHabitacion(HabitacionDTO habitacionDTO){
        return new HabitacionDTO(habitacionLogic.crearHabitacion(habitacionDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public HabitacionDTO updateHabitacion(@PathParam("id") Long id, HabitacionDTO habitacionDTO ){
        HabitacionEntity entity = habitacionLogic.obtenerHabitacion(id);
        if(entity == null){
            throw new RuntimeException("la habitacion no existe");
        }
        return new HabitacionDTO(habitacionLogic.actualizarHabitacion(id, habitacionDTO.toEntity()));
    }
    
    
    @DELETE
    @Path("{habitacionId: \\d+}")
    public void deleteHabitacion(@PathParam("habitacionId") Long id){
        HabitacionEntity entity = habitacionLogic.obtenerHabitacion(id);
        if(entity == null){
            throw new RuntimeException("La habitacion no existe");
        }
        habitacionLogic.eliminarHabitacion(id);
    }
}


=======
/**
 *
 * @author Devoto
 */
public class HabitacionResources {
    
}
>>>>>>> 82629539ac7f0d0900c0da3323f30dfa5b5f3726
