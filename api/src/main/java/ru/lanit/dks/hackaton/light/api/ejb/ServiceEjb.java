package ru.lanit.dks.hackaton.light.api.ejb;

import ru.lanit.dks.hackaton.light.api.service.api.ServiceService;

import javax.ejb.Remote;

@Remote
public interface ServiceEjb extends ServiceService {
}
