package ru.lanit.dks.hackaton.light.service.jpa.model;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    private Long id;

    @Column(nullable = false)
    private Integer horsePower;

    @ManyToOne
    private Person person;

    @Column(nullable = false)
    private String model;

    @ManyToOne
    private CarVendor vendor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarVendor getVendor() {
        return vendor;
    }

    public void setVendor(CarVendor vendor) {
        this.vendor = vendor;
    }
}
