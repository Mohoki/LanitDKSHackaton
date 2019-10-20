package ru.lanit.dks.hackaton.light.service.jpa.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Person {

    @Id
    private Long id;

    @OneToMany
    private Collection<Car> cars;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date birthDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<Car> getCars() {
        return cars;
    }

    public void setCars(Collection<Car> cars) {
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
