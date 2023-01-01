package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8080/controller で呼び出せる
 */
@RestController
@RequestMapping("/controller")
public class ControllerA {

    /**
     * GETメソッド
     * http://localhost:8080/controller/get_method で呼び出せる
     *
     * @param param1 URL リクエストで ?get_param=~ で送信できるパラメータ
     */
    @GetMapping("/get_method")
    public String getA(@RequestParam("get_param") String param1) {
        // テスト用のURL
        // http://localhost:8080/controller/get_method?get_param=test
        return "name successfully created" + param1;
    }

    /**
     * POSTメソッド
     * http://localhost:8080/controller/post_method
     *
     * @param param1 　URL リクエストのパラメータ
     */
    @PostMapping("/post_method")
    public String postMethod(@RequestParam("post_param") String param1) {
        // テスト用のURL
        // http://localhost:8080/controller/post_method?post_param=test
        return "POST　メソッドのレスポンス_param->" + param1;
    }
}
