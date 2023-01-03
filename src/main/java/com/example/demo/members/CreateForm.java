package com.example.demo.members;

import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class CreateForm {
    @NotNull
    @NotBlank
    @NotEmpty
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
