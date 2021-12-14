package com.sleptawake.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by KBS.
 * User: KBS
 * Date: 12/14/2021
 * Time: 오후 8:27
 */
public class WebRestController {

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

}
