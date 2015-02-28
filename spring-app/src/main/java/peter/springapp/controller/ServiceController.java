package main.java.peter.springapp.controller;

import main.java.peter.apringapp.model.SimpleData;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Piotr Kulma on 27.02.15.
 */

@RestController
public class ServiceController {
    private List<SimpleData> data;

    public ServiceController() {
        data = new ArrayList<>();
        data.add(new SimpleData(0, "Jan Nowak"));
        data.add(new SimpleData(1, "Jan Nowakowski"));
        data.add(new SimpleData(2, "Krzysztof Nowak"));
        data.add(new SimpleData(3, "Piotr Kulma"));
    }

    @RequestMapping(value = "/people/{id}", method = RequestMethod.GET)
    public SimpleData service(@PathVariable int id) {
        return find(id);
    }

    @RequestMapping(value = "/people",method = RequestMethod.GET)
    public List<SimpleData> services() {
        return data;
    }

    private SimpleData find(int id) {
        for(SimpleData d : data) {
            if(d.getId() == id) {
                return d;
            }
        }

        return null;
    }
}
