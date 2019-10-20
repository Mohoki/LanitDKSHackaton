package ru.lanit.dks.hackaton.light.ejb;

import ru.lanit.dks.hackaton.light.api.dto.StatisticDto;
import ru.lanit.dks.hackaton.light.api.ejb.ServiceEjb;
import ru.lanit.dks.hackaton.light.api.service.DaoService;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class ServiceEjbBean implements ServiceEjb {

    @Inject
    public DaoService daoService;

    @Override
    public StatisticDto getStatistics() {
        return daoService.getStatistics();
    }

    @Override
    public void clear() {
        daoService.clear();
    }
}
