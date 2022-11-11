package com.mycompany.docavailabilityapp.service;

import Beans.Doc;
import Model.DoctorAppointment;
import java.util.Collection;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/doctor_avalilability/{specialization}")
//@Path("/example")
public class ExampleService {
    
    @Inject Doc docService;
    
    @RolesAllowed("Patient")
    //@Path("/doctor_avalilability/{specialization}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<DoctorAppointment> getDoctorAvailability(@PathParam("specialization") String Specialization){
        return docService.getDoctorAvailability(Specialization);
    }

//    @GET
//    //@Produces(MediaType.APPLICATION_JSON)
//    public String get(){
//        return "Hello world";
//    }
}
