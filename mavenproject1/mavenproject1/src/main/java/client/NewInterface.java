/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package client;

import javax.ws.rs.GET;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 *
 * @author root
 */

@RegisterRestClient(baseUri="http://localhost:8585/mavenproject1/rest/example")
public interface NewInterface {
    @GET
    public String get();
}