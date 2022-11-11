package client;

import entity.Students;
import java.util.Collection;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8085/ProducerDB/rest/example")
public interface ApiInterface {
    
    @ClientHeaderParam(name="authorization",value="{generateJWTToken}")
    @GET
    @Path("student")
    @RolesAllowed("admin")
    public Collection<Students> getStudent();
    
    default String generateJWTToken()
    {
        Config config = ConfigProvider.getConfig();
        String jwt = config.getValue("jwt-string", String.class);
        String authtoken = "Bearer "+jwt;
        return authtoken;
    }
}
