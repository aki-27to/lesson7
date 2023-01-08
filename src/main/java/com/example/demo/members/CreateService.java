package com.example.demo.members;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class CreateService {
    public String getCreateForm(@RequestParam("name") String param1) {
        return param1;
    }
}
