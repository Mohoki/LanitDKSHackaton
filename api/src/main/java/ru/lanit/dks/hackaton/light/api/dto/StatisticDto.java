package ru.lanit.dks.hackaton.light.api.dto;

import javax.json.bind.annotation.JsonbProperty;
import java.io.Serializable;

public class StatisticDto implements Serializable {

    @JsonbProperty("personcount")
    private Long personCount;

    @JsonbProperty("carcount")
    private Long carCount;

    @JsonbProperty("uniquevendorcount")
    private Long uniqueVendorCount;

    public Long getPersonCount() {
        return personCount;
    }

    public void setPersonCount(Long personCount) {
        this.personCount = personCount;
    }

    public Long getCarCount() {
        return carCount;
    }

    public void setCarCount(Long carCount) {
        this.carCount = carCount;
    }

    public Long getUniqueVendorCount() {
        return uniqueVendorCount;
    }

    public void setUniqueVendorCount(Long uniqueVendorCount) {
        this.uniqueVendorCount = uniqueVendorCount;
    }
}
