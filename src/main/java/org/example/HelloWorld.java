package org.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("hello")
public class HelloWorld {

  @GET
  @Path("/{input}")
  @Produces("text/plain")
  public String ping(@PathParam("input") String input) {
    return "Hello, "+input;
  }
}
