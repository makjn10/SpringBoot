package com.mayank.springcoredemo.rest;

import com.mayank.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // dependency
    private Coach coach;

    // constructor for dependency injection
    @Autowired
    DemoController(@Qualifier("aquatic") Coach coach) {
        System.out.println("In constructor : " + getClass().getSimpleName());
        this.coach = coach;
    }

    @GetMapping("dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }


}
