package dev.ifrs;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/quilo_milhas")
public class ConversorRestful {

    /**
     * @param quilometros
     * @return
     */
    @Path("/quilo_milhas/quilometros")
    @POST
    @Consumes(MediaType.APLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public Double milhas(@PathParam("quilometros") String quilometros) {
        
        Double quiloms = Double.parseDouble(quilometros);

        return String.valueOf(quiloms * 0.621371);
    }
}