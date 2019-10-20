package ru.lanit.dks.hackaton.light.api;

import javax.json.bind.annotation.JsonbProperty;
import java.io.Serializable;
import java.util.Objects;

public class BaseDto implements Serializable {

    @JsonbProperty("id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseDto baseDto = (BaseDto) o;
        return id.equals(baseDto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
