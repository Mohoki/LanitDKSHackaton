package ru.lanit.dks.hackaton.light.web;

import ru.lanit.dks.hackaton.light.web.json.*;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("resources")
public class AppController extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> resources = new HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(CarWebController.class);
        resources.add(ClearWebController.class);
        resources.add(PersonWebController.class);
        resources.add(PersonWithCarsController.class);
        resources.add(StatisticWebContoller.class);
    }

}
