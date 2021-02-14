package com.madhushika.storecloud.storeprocesstask.services;
import org.springframework.stereotype.Service;

@Service
public class StoreProcessServiceImpl implements StoreProcessService {


    @Override
    public boolean validateCode(String code) {
        return code.length() > 4;
    }
}
