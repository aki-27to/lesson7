package com.example.demo.members;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CreateForm {
    @NotNull
    @NotBlank
    @NotEmpty
    @Max(20)
    private String name;
    private String birthday;
    public String getName() {
        return name;
    }
    public String getBirthday(){
        return birthday;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
}
