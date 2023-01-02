package com.example.demo.members;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8080/controller で呼び出せる
 */
@RestController
@RequestMapping
public class ControllerA {

    /**
     * GETメソッド
     * http://localhost:8080/controller/get_method で呼び出せる
     * @param param1 URL リクエストで ?get_param=~ で送信できるパラメータ
     */
    @GetMapping("/names")
    public String getMethod(@RequestParam("name") String param1) {
        // テスト用のURL
        // http://localhost:8080/names?name=test
        return param1;
    }

    /**
     * POSTメソッド
     */
    @PostMapping("/names")
    String postMethod(){
        // テスト用のURL
        // http://localhost:8080/names?post_param=test
        return "name successfully created";
    }
}
