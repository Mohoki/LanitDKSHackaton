package ru.lanit.dks.hackaton.light.service.jpa.dao;

import ru.lanit.dks.hackaton.light.service.jpa.model.Person;

public interface PersonDao {

    Person getPerson(Long id);

}
