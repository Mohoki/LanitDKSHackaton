package ru.lanit.dks.hackaton.light.web.json;

import ru.lanit.dks.hackaton.light.api.dto.StatisticDto;
import ru.lanit.dks.hackaton.light.api.ejb.ServiceEjb;
import ru.lanit.dks.hackaton.light.api.service.DaoService;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/statistics")
public class StatisticWebContoller {

    @EJB
    public ServiceEjb serviceEjb;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public StatisticDto getStatistic() {
        return serviceEjb.getStatistics();
    }

}
