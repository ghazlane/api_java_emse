package com.ghazlane.projectweb.web_project_ghazlane.hello;

import org.springframework.stereotype.Service;

@Service
public class ConsoleGreetingService implements GreetingService {
    @Override
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}