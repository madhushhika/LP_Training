package com.madhushika.cloud.configconsumer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MemberConfiguration {

    @Autowired
    Environment environment;


    public String getDefaultModel(){
        return environment.getProperty("vehicle.default.model");
    }
    public String getMinRentPeriod(){
        return environment.getProperty("member.rent.min");
    }

}
