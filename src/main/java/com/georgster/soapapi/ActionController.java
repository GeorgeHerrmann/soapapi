package com.georgster.soapapi;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {
    @GetMapping("/action")
    public CurrentAction currentAction () {
        return new CurrentAction();
    }
}
