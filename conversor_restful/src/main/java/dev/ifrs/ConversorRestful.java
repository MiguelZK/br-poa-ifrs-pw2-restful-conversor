package dev.ifrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/quilo_milhas")
public class ConversorRestful {

    /**
     * @param quilometros
     * @return
     */
    @Path("/quilometros")
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String milhas(@FormParam("quilometros") double quilometros) {

        return String.valueOf(quilometros * 0.621371);
    }

    @Path("/{nos}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ConversorNosEmKm conversorNosEmKm(@PathParam("nos") double nos) {
        return new ConversorNosEmKm(nos);
    }
}