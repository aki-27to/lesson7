package com.example.demo.members;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CreateForm {
    @NotNull
    String notNullField;

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
