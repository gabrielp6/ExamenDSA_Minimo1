/*
package edu.upc.dsa.services;
import edu.upc.dsa.Covid19ManagerImpl;
import edu.upc.dsa.models.Persona;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;
import java.util.List;
@Api(value = "/Covid", description = "Endpoint to Text Service")
@Path("Covid")
public class CovidService {
    private Covid19ManagerImpl CM;

    public CovidService() {
        this.CM = Covid19ManagerImpl.getInstance();
        if (CM.getUserSize() == 0) {
            CM.aplicarVacuna("Gabriel", "1", new Date(2021, 10, 3));
            CM.aplicarVacuna("Juan", "1", new Date(2021, 9, 9));
            CM.aplicarVacuna("Toni", "2", new Date(2021, 06, 24));
            CM.aplicarVacuna("Maria", "3", new Date(2021, 05, 13));


        }

        if (CM.getSeguimientosSize() == 0) {

            CM.añadirSeguimiento("Mal estado", new Date(2021, 3, 20), "1", "1");
            CM.añadirSeguimiento("Buen estado", new Date(2021, 5, 20), "2", "2");
            CM.añadirSeguimiento("Regular estado", new Date(2021, 6, 20), "3", "3");


        }


    }


    @POST
    @ApiOperation(value = "Aplicamos vacuna", notes = "P1")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Persona.class),
            @ApiResponse(code = 500, message = "Validation Error")

    })

    @Path("/aplicarVacuna/{idPersona}/{idVacuna}/{fecha}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response nuevaVacunacion(@PathParam("idPersona") String idPersona, @PathParam("idVacuna") String idVacuna, @PathParam("fecha") Date fecha) {

        CM.aplicarVacuna(idPersona, idVacuna, fecha);
        return Response.status(201).entity().build();


    }

}
*/

