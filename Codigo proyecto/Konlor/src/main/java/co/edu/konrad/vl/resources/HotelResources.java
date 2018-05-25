/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.resources;


import co.edu.konrad.vl.dto.HotelDTO;

import co.edu.konrad.vl.entities.HotelEntity;

import co.edu.konrad.vl.logic.HotelLogic;
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
 * Recurso/Servicio REST para manejo de Hotel
 * @author Cesar
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/hotel")
public class HotelResources {
 
    @EJB
    private HotelLogic hotelLogic;
    
    
    @GET
    public List<HotelDTO> getHotelList(){
        List<HotelEntity> cadena= hotelLogic.obtenerHotel();
        return HotelDTO.toHotelList(cadena);
    }
 
    @GET
    @Path("{id: \\d+}")
    public HotelDTO getHotel(@PathParam("id") Long id){
        HotelEntity cadena = hotelLogic.obtenerHotel(id);
        if(cadena == null){
            throw new RuntimeException("El hotel no existe");
        }
        return new HotelDTO(cadena);
    }
    
    @POST
    public HotelDTO createHotel(HotelDTO hotelDTO){
        return new HotelDTO(hotelLogic.crearHotel(hotelDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public HotelDTO updateHotel(@PathParam("id") Long id, HotelDTO hotelDTO ){
        HotelEntity entity = hotelLogic.obtenerHotel(id);
        if(entity == null){
            throw new RuntimeException("el hotel no existe");
        }
        return new HotelDTO(hotelLogic.actualizarHotel(id, hotelDTO.toEntity()));
    }
    
    
    @DELETE
    @Path("{hotelId: \\d+}")
    public void deleteHotel(@PathParam("hotelId") Long id){
        HotelEntity entity = hotelLogic.obtenerHotel(id);
        if(entity == null){
            throw new RuntimeException("El hotel no existe");
        }
        hotelLogic.eliminarHotel(id);
    }
}


