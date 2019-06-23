package com.brio.backend;


import com.brio.backend.model.Traffic;
import com.brio.backend.repository.TrafficRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);


    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner setup(@Qualifier("trafficRepository") TrafficRepository trafficReposity){
        return(args) -> {
            //TODO
            //REPLACE WITH PARSING FROM TEXT FILE

            trafficReposity.save(new Traffic("M", "Less Than Normal", 1, 063000, true));
            trafficReposity.save(new Traffic("M", "Empty", 1, 120000, true));
            trafficReposity.save(new Traffic("M", "Full", 49, 18000, true));
            trafficReposity.save(new Traffic("T", "Busy", 18, 063000, true));
            trafficReposity.save(new Traffic("T", "Empty", 0, 120000, true));
            trafficReposity.save(new Traffic("T", "Less Than Normal", 1, 180000, true));
            trafficReposity.save(new Traffic("W", "Packed", 20, 063000, true));
            trafficReposity.save(new Traffic("W", "Empty", 1, 120000, true));
            trafficReposity.save(new Traffic("W", "Packed", 20, 180000, true));

        };

    }

}
