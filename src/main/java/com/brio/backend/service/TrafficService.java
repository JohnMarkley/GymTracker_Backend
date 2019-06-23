package com.brio.backend.service;

import java.util.List;

import com.brio.backend.model.Traffic;

public interface TrafficService {
    Traffic getTrafficById(Long id);
    List<Traffic> getAllTraffic();
}
