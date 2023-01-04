package com.example.demo.members;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.net.URI;

/**
 * http://localhost:8080/controller で呼び出せる
 */
@RestController
@RequestMapping
public class ControllerA {
    /*** GETメソッド*/
    @GetMapping("/names/get")
    public CreateForm getMethod(@Valid @NotBlank String name, @RequestParam @Valid @NotBlank String birthday) {
        return new CreateForm(name, birthday);
    }

    /*** POSTメソッド*/
    @PostMapping("/names/post")
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
    }



}
