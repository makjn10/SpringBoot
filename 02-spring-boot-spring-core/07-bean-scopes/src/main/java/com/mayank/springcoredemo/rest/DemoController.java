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

    private Coach anotherCoach;

    // constructor for dependency injection
    @Autowired
    DemoController(@Qualifier("cricketCoach") Coach coach,
                   @Qualifier("cricketCoach") Coach anotherCoach) {
        System.out.println("In constructor : " + getClass().getSimpleName());
        this.coach = coach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans coach == anotherCoach " + (coach == anotherCoach);
    }

//    @Autowired
//    public void setCoach(Coach coach) {
//        this.coach = coach;
//    }

    // @Autowired(required = false) can be used with setter injection if dependency is optional and you want spring app not to fail
}
