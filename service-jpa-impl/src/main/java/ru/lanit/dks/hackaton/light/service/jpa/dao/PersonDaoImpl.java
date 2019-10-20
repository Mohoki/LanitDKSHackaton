package ru.lanit.dks.hackaton.light.service.jpa.dao;

import ru.lanit.dks.hackaton.light.api.dto.PersonDto;
import ru.lanit.dks.hackaton.light.service.jpa.model.Person;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RequestScoped
public class PersonDaoImpl implements PersonDao {

    @PersistenceContext(name = "HDKSPersistenceUnit")
    private EntityManager entityManager;

    public void addPerson(final PersonDto personDto) {

    }

    public Person getPerson(Long id) {
        return entityManager.find(Person.class, id);
    }

}
