package com.brio.backend.service;


import com.brio.backend.model.Traffic;
import com.brio.backend.repository.TrafficRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("trafficService")
public class implementationTrafficService implements TrafficService {

    @Qualifier("trafficRepository")
    @Autowired
    TrafficRepository trafficRepository;

    @Override
    public Traffic getTrafficById(Long id){
        return trafficRepository.findById(id).orElse(null);
    }

    @Override
    public List<Traffic> getAllTraffic(){
        return trafficRepository.findAll();
    }


}
