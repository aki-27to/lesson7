package com.example.demo.members;

public class Member {
    private int id;
    private String name;
    private String birthday;

    public Member(
            int id,
            String name,
            String birthday) {
        this.id = 0001;
        this.name = name;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
