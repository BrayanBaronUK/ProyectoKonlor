/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.resources;

<<<<<<< HEAD
import co.edu.konrad.vl.dto.Tipo_HabitacionDTO;
import co.edu.konrad.vl.entities.Tipo_HabitacionEntity;
import co.edu.konrad.vl.logic.Tipo_HabitacionLogic;
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
 * Recurso/Servicio REST para manejo de Tipo_Habitacion
 * @author Cesar
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/tipo_habitacion")
public class Tipo_HabitacionResources {

 
    @EJB
    private Tipo_HabitacionLogic tipo_habitacionLogic;
    
    
    @GET
    public List<Tipo_HabitacionDTO> getTipo_HabitacionList(){
        List<Tipo_HabitacionEntity> cadena= tipo_habitacionLogic.obtenerTipo_Habitacion();
        return Tipo_HabitacionDTO.toTipo_HabitacionList(cadena);
    }
 
    @GET
    @Path("{id: \\d+}")
    public Tipo_HabitacionDTO getTipo_Habitacion(@PathParam("id") Long id){
        Tipo_HabitacionEntity cadena = tipo_habitacionLogic.obtenerTipo_Habitacion(id);
        if(cadena == null){
            throw new RuntimeException("El tipo habitacion no existe");
        }
        return new Tipo_HabitacionDTO(cadena);
    }
    
    @POST
    public Tipo_HabitacionDTO createTipo_Habitacion(Tipo_HabitacionDTO hotelDTO){
        return new Tipo_HabitacionDTO(tipo_habitacionLogic.crearTipo_Habitacion(hotelDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public Tipo_HabitacionDTO updateTipo_Habitacion(@PathParam("id") Long id, Tipo_HabitacionDTO hotelDTO ){
        Tipo_HabitacionEntity entity = tipo_habitacionLogic.obtenerTipo_Habitacion(id);
        if(entity == null){
            throw new RuntimeException("el tipo habitacion no existe");
        }
        return new Tipo_HabitacionDTO(tipo_habitacionLogic.actualizarTipo_Habitacion(id, hotelDTO.toEntity()));
    }
    
    
    @DELETE
    @Path("{tipo_habitacionId: \\d+}")
    public void deleteTipo_Habitacion(@PathParam("tipo_habitacionId") Long id){
        Tipo_HabitacionEntity entity = tipo_habitacionLogic.obtenerTipo_Habitacion(id);
        if(entity == null){
            throw new RuntimeException("El tipo habitacion no existe");
        }
        tipo_habitacionLogic.eliminarTipo_Habitacion(id);
    }
}

=======
/**
 *
 * @author Devoto
 */
public class Tipo_HabitacionResources {
    
}
>>>>>>> 82629539ac7f0d0900c0da3323f30dfa5b5f3726
