package com.xavier.material.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author Xavier
 * Created by Xavier on 2018/12/13
 */
@RestController
@RequestMapping("/applyMaterial")
public class ApplyMaterialController {

    @PostMapping("/apply")
    public String apply(@RequestBody Map<String, Object> request) {
        System.out.println(request.get("key"));
        return "success";
    }

}
