package com.springcore.producerdb.service;

import Models.DataModel;
import entity.Students;
import java.util.Collection;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/example")
public class ExampleService 
{
    @Inject DataModel dm;
    
    @GET
    @Path("student")
    @RolesAllowed("admin")
    public Collection<Students> getStudent()
    {
        return dm.getStudents();
    }
    
    @GET
    public String get() 
    {
        return "Hello there";
    }

}
