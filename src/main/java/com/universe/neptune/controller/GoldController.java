package com.universe.neptune.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gold")
public class GoldController {

    @RequestMapping("/get-gold")
    public String getGold(){
        return "Gold";
    }
}
