package com.example.demo.members;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.net.URI;


@Validated
@RestController
@RequestMapping(path = "api/v1/members")
public class MemberController {
    /**
     * GETメソッド
     */
    @GetMapping
    public Member getMember(int id,
                            @Valid @NotBlank @Pattern(regexp = "[a-z|A-Z]{1,20}?") @RequestParam String name,
                            @Valid @NotBlank @RequestParam String birthday) {
        return new Member(id, name, birthday);
    }
    //@Pattern(regexp = "[0-9]{1,20}?")
    //決まった文字列を単品で返す
    /*
    public String getName() {
        return "name";
    }*/
    //決まった文字列を複数返す
    /*
    public Member getMember() {
        return new Member("name", "birthday");
    }*/


    /**
     * POST
     */
    @PostMapping
    public ResponseEntity<String> postMember(@RequestBody Member form) {
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body("name successfully created");

    }

    /**
     * PATCH
     */
    @PatchMapping("/{id}")
    public ResponseEntity<String> patchMember(@PathVariable int id) {
        return new ResponseEntity<>("name successfully updated", HttpStatus.OK);
    }



    /*
    public String patchMethod() {
        return "patched!";
    }*/


    /**
     * DELETE
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMember(@PathVariable int id) {
        return new ResponseEntity<>("name successfully deleted", HttpStatus.OK);
    }

}