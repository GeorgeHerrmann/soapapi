package com.georgster.soapapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {
    @GetMapping("/test")
    public CurrentAction currentAction (@RequestParam(value = "name", defaultValue = "World") String name) {
        return new CurrentAction(name);
    }
}
