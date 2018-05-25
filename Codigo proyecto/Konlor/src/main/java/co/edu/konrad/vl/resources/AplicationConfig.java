/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.resources;

import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
<<<<<<< HEAD
 * @author Cesar
=======
 * @author Devoto
>>>>>>> 82629539ac7f0d0900c0da3323f30dfa5b5f3726
 */
@ApplicationPath("/api")    
public class AplicationConfig extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.edu.konrad.vl.resources.Cadena_hoteleraResources.class);
        resources.add(co.edu.konrad.vl.resources.ClienteResources.class);
        resources.add(co.edu.konrad.vl.resources.Forma_pagoResources.class);
        resources.add(co.edu.konrad.vl.resources.HabitacionResources.class);
        resources.add(co.edu.konrad.vl.resources.HotelResources.class);
        resources.add(co.edu.konrad.vl.resources.ReservaResources.class);
        resources.add(co.edu.konrad.vl.resources.Rol_UsuarioResources.class);
        resources.add(co.edu.konrad.vl.resources.Tipo_HabitacionResources.class);
    }
}

