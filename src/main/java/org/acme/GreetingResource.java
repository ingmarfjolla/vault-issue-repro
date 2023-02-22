package org.acme;


import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {
//    @ConfigProperty(name = "a-private-key")
//    String privateKey;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
    @Inject
    GiftRepository gift;

    @GET
    @Path("/gift-count")
    @Produces(MediaType.TEXT_PLAIN)
    public Uni<Long> geGiftCount() {
        return gift.count();
    }
}