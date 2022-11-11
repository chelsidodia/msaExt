/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package client;

import Model.DoctorAppointment;
import java.util.Collection;
import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 *
 * @author kruti
 */
@RegisterRestClient(configKey = "myclient")
@ApplicationScoped
 //@Named
@Path("/doctor_avalilability/{specialization}")
public interface MSAClient {
    @GET
    @ClientHeaderParam(name="authorization", value="{generateJWTToken}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<DoctorAppointment> getDoctorAvailability(@PathParam("specialization") String Specialization);
   
    default String generateJWTToken()
    {
         Config config = ConfigProvider.getConfig();
         String token ="Bearer "+config.getValue("jwt-string", String.class) ;
         System.out.println("Token = "+token);
         return token;
    }
}
