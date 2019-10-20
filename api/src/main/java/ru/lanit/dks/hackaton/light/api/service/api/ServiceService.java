package ru.lanit.dks.hackaton.light.api.service.api;

import ru.lanit.dks.hackaton.light.api.dto.StatisticDto;

public interface ServiceService {

    StatisticDto getStatistics();

    void clear();

}
