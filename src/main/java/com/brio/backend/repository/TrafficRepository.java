package com.brio.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brio.backend.model.Traffic;

@Repository("trafficRepository")
public interface TrafficRepository extends JpaRepository<Traffic, Long>{
        //JPARepository
    }


