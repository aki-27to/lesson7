package com.example.demo.members;

public class CreateForm {
    private String name;
    private String birthday;

    public CreateForm(String name, String dateOfBirth) {
        this.name = name;
        this.birthday = dateOfBirth;
    }


    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.birthday = dateOfBirth;
    }
}
