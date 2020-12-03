package com.github.mxsm.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author mxsm
 * @Date 2020/11/21
 */
@RestController
@RequestMapping("current")
public class RouteController {

    @GetMapping("/date")
    public String date(){
        return new Date().toString();
    }

}
