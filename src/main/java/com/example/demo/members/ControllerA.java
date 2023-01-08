package com.example.demo.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/members")
public class ControllerA {

    private final CreateService createService;

    @Autowired
    public ControllerA(CreateService createService) {
        this.createService = createService;
    }


    @GetMapping("/getmember")
    public List<CreateForm> getCreateForm() {
        return createService.getCreateForm();
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