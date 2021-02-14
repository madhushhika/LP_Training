package com.madhushika.storecloud.storeprocesstask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class StoreProcessTaskRunner implements CommandLineRunner {

    @Autowired
    StoreProcessService storeProcessService;

    @Override
    public void run(String... args) throws Exception {
        if(args.length>0) {
            System.out.println("task running with arguments");

            if (storeProcessService.validateCode(args[0])) {
                System.out.println("valid postal code");
            } else
                System.out.println("invalid postal code");
        }else
            System.out.println("task running without arguments");
    }
}
