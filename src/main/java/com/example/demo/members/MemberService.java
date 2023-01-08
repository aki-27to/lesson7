package com.example.demo.members;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
public class MemberService {
    public List<Member> getMember(
            @RequestParam("name") List<Member> name,
            @RequestParam("birthday") List<Member> birthday) {
        return name;
    }

}
