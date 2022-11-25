package com.georgster.soapapi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class ActionController {
    @GetMapping("/action")
    public CurrentAction currentAction () {
        return new CurrentAction();
    }
}
