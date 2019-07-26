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

            trafficReposity.save(new Traffic("M", "The Gym Is Less Busy Than Normal", 5, 063000, true));
            trafficReposity.save(new Traffic("M", "The Gym Will Be Busy On Wednesday, July 31 @ 5:30pm", 15, 063000, true));
            trafficReposity.save(new Traffic("M", "The Gym Will Be Empty On Monday, August 5 @ 7:30am", 2 , 063000, true));

            trafficReposity.save(new Traffic("M", "Empty", 2, 120000, true));
            trafficReposity.save(new Traffic("M", "Full", 49, 18000, true));
            trafficReposity.save(new Traffic("T", "Busy", 18, 063000, true));
            trafficReposity.save(new Traffic("T", "Empty", 3, 120000, true));
            trafficReposity.save(new Traffic("T", "Less Than Normal", 3, 180000, true));
            trafficReposity.save(new Traffic("W", "Packed", 20, 063000, true));
            trafficReposity.save(new Traffic("W", "Empty", 2, 120000, true));
            trafficReposity.save(new Traffic("W", "Packed", 20, 180000, true));

        };

    }

}
