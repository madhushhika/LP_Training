package com.madhushika.storecloud.storeprocesstask;

import com.madhushika.storecloud.storeprocesstask.services.StoreProcessTaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class StoreProcessTaskApplication {
    @Bean
    StoreProcessTaskRunner getStoreProcessTaskRunner() {
        return new StoreProcessTaskRunner();
    }

    public static void main(String[] args) {
        SpringApplication.run(StoreProcessTaskApplication.class, args);
    }


}
