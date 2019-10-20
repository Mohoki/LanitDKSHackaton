package ru.lanit.dks.hackaton.light.web.json;

import ru.lanit.dks.hackaton.light.api.NoDtoFoundException;
import ru.lanit.dks.hackaton.light.api.dto.PersonWithCarsDto;
import ru.lanit.dks.hackaton.light.api.ejb.PersonEjb;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/personwithcars")
public class PersonWithCarsController {

    @EJB
    public PersonEjb personEjb;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("personid={personId}")
    public PersonWithCarsDto getPersonWithCars(@PathParam("personId") Long personId) {
        try {
            return personEjb.getPersonWithCars(personId);
        } catch (NoDtoFoundException ex) {
            throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }
    }

}
