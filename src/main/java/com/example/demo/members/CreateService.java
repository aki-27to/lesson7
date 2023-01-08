package com.example.demo.members;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
public class CreateService {
    public List<CreateForm> getCreateForm(
            @RequestParam("name") List<CreateForm> name,
            @RequestParam("birthday") List<CreateForm> birthday) {
        return name;
    }

}
