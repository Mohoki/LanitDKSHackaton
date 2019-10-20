package ru.lanit.dks.hackaton.light.web.json;

import ru.lanit.dks.hackaton.light.api.dto.CarDto;
import ru.lanit.dks.hackaton.light.api.ejb.ServiceEjb;
import ru.lanit.dks.hackaton.light.api.service.DaoService;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/clear")
public class ClearWebController {

    @EJB
    public ServiceEjb serviceEjb;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public void clear() {
        serviceEjb.clear();
    }

}
