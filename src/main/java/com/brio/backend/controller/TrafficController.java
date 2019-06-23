package com.brio.backend.controller;

import com.brio.backend.model.Traffic;
import com.brio.backend.service.TrafficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrafficController {

        @Autowired
        private TrafficService trafficService;


        @RequestMapping(value = "/traffic", method = RequestMethod.GET)
        public List<Traffic> getTraffic(){
            return trafficService.getAllTraffic();
        }

        @RequestMapping(value = "/traffic/{id}", method = RequestMethod.GET)
        public Traffic getTraffic(@PathVariable("id") long id){
            return trafficService.getTrafficById(id);
        }


}
