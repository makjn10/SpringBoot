package com.mayank.springcoredemo.rest;

import com.mayank.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // dependency
    private final Coach coach;

    // constructor for dependency injection
    @Autowired
    DemoController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
