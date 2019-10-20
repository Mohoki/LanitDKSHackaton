package ru.lanit.dks.hackaton.light.web.json;

import ru.lanit.dks.hackaton.light.api.AddDtoException;
import ru.lanit.dks.hackaton.light.api.dto.CarDto;
import ru.lanit.dks.hackaton.light.api.dto.PersonDto;
import ru.lanit.dks.hackaton.light.api.ejb.CarEjb;
import ru.lanit.dks.hackaton.light.api.service.DaoService;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/car")
public class CarWebController {

    @EJB
    public CarEjb carEjb;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void addCar(CarDto carDto) {
        try {
            carEjb.addCar(carDto);
        } catch (AddDtoException ex) {
            throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }
    }

}
