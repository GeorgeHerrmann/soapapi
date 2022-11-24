package com.georgster.soapapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CurrentAction {
    private String action;
    public CurrentAction() {
        try {
            action = Files.readString( Path.of(System.getProperty("user.dir"), "..", "soapbot", "src", "main", "java", "com", "georgster", "api", "data", "currentaction.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getAction() {
        return action;
    }
    
}
