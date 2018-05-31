
package co.edu.konrad.vl.resources;

import co.edu.konrad.vl.dto.Cadena_hoteleraDTO;
import co.edu.konrad.vl.entities.Cadena_hoteleraEntity;
import co.edu.konrad.vl.logic.Cadena_hoteleraLogic;
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
 * Recurso/Servicio REST para manejo de cadena hotelera
 * @author Cesar
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/cadena_hotelera")
public class Cadena_hoteleraResources {    
    @EJB
    private Cadena_hoteleraLogic cadena_hoteleraLogic;
    
    /**
     * Metodo HTTP - GET para obtener todas las Cadenas hoteleras
     * @return Lista de cadena
     */
    @GET
    public List<Cadena_hoteleraDTO> getCadena_hoteleraList(){
        List<Cadena_hoteleraEntity> cadena= cadena_hoteleraLogic.obtenerCadena_hotelera();
        return Cadena_hoteleraDTO.toCadena_hoteleraList(cadena);
    }
    /**
     * 
     * @param id
     * @return 
     */
    @GET
    @Path("{id: \\d+}")
    public Cadena_hoteleraDTO getCadena_hotelera(@PathParam("id") Long id){
        Cadena_hoteleraEntity cadena = cadena_hoteleraLogic.obtenerCadena_hotelera(id);
        if(cadena == null){
            throw new RuntimeException("La cadena hotelera no existe");
        }
        return new Cadena_hoteleraDTO(cadena);
    }
    
    @POST
    public Cadena_hoteleraDTO createCadena_hotelera(Cadena_hoteleraDTO cadena_hoteleraDTO){
        return new Cadena_hoteleraDTO(cadena_hoteleraLogic.crearCadena_hotelera(cadena_hoteleraDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public Cadena_hoteleraDTO updateCadena_hotelera(@PathParam("id") Long id, Cadena_hoteleraDTO cadena_hoteleraDTO ){
        Cadena_hoteleraEntity entity = cadena_hoteleraLogic.obtenerCadena_hotelera(id);
        if(entity == null){
            throw new RuntimeException("La cadena hotelera no existe");
        }
        return new Cadena_hoteleraDTO(cadena_hoteleraLogic.actualizarCadena_hotelera(id, cadena_hoteleraDTO.toEntity()));
    }
    
    
    @DELETE
    @Path("{cadena_hoteleraId: \\d+}")
    public void deleteCadena_hotelera(@PathParam("cadena_hoteleraId") Long id){
        Cadena_hoteleraEntity entity = cadena_hoteleraLogic.obtenerCadena_hotelera(id);
        if(entity == null){
            throw new RuntimeException("La cadena hotelera no existe");
        }
        cadena_hoteleraLogic.eliminarCadena_hotelera(id);
    }
}
