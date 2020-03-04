package org.example.swagger.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/api")
public class EmployeeRestHandler {

    @GET
    @Path("/ping")
    public Response ping() {
        return Response.ok().entity("Ping success").build();
    }

}
