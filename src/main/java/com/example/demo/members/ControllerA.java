package com.example.demo.members;

import org.springframework.web.bind.annotation.*;
/**
 * http://localhost:8080/controller で呼び出せる
 */
@RestController
@RequestMapping
public class ControllerA {

    /**
     * GETメソッド
     */
    @GetMapping("/names")
    public String getMethod(@RequestParam("name") String param1) {
        //名前がNullの時
        // テスト用のURL
        // http://localhost:8080/names?name=test
        return param1;
    }

    /**
     * POSTメソッド
     */
    @PostMapping("/names/post")
    public String postMethod(){
        return "posted!";
    }

    @PatchMapping("/names/patch")
    public String patchMethod(){
        return "patched!";
    }

    @DeleteMapping("/names/delete")
    public String deleteMethod(){
        return "deleted!";
    }



}
