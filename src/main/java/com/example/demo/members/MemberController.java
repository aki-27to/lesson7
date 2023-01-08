package com.example.demo.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/members")
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


    @GetMapping
    public List<Member> getMember() {
        return memberService.getMember(
                @RequestParam("name") List < Member > name,
                @RequestParam("birthday") List < Member > birthday);
    }


    /*** POSTメソッド*/
    /*@PostMapping("/names/post")
    public ResponseEntity<String> create(@RequestBody CreateForm form) {
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/names/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body("name success");

    }

    @PatchMapping("/names/patch")
    public String patchMethod() {
        return "patched!";
    }

    @DeleteMapping("/names/delete")
    public String deleteMethod() {
        return "deleted!";
    }*/

}