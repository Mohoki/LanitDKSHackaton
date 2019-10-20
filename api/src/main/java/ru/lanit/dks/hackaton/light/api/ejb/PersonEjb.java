package ru.lanit.dks.hackaton.light.api.ejb;

import ru.lanit.dks.hackaton.light.api.service.api.PersonService;

import javax.ejb.Remote;

@Remote
public interface PersonEjb extends PersonService {
}
