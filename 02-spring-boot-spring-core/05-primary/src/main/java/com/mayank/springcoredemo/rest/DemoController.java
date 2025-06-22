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
    DemoController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

//    @Autowired
//    public void setCoach(Coach coach) {
//        this.coach = coach;
//    }

    // @Autowired(required = false) can be used with setter injection if dependency is optional and you want spring app not to fail
}
