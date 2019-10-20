package ru.lanit.dks.hackaton.light.web.json;

import ru.lanit.dks.hackaton.light.api.AddDtoException;
import ru.lanit.dks.hackaton.light.api.dto.PersonDto;
import ru.lanit.dks.hackaton.light.api.ejb.PersonEjb;
import ru.lanit.dks.hackaton.light.api.service.DaoService;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/person")
public class PersonWebController {

    @EJB
    public PersonEjb personEjb;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void addPerson(PersonDto personDto) {
        try {
            personEjb.addPerson(personDto);
        } catch (AddDtoException ex) {
            throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }

    }
}
