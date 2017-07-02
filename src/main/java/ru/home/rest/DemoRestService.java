package ru.home.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by developer on 02.07.2017.
 */
@Path("/hello")
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class DemoRestService {

    @GET
    @Path("{id}")
    @Produces("text/plain")
    public String getHelloText(@PathParam("id") String id) {


        return "Hello, world";
    }
}
