package com.dks.testinglikeaprodemo.leapyear;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeapYearController {

    private final LeapYearService leapYearService;

    public LeapYearController(LeapYearService leapYearService) {
        this.leapYearService = leapYearService;
    }

    @GetMapping("/leapYears/isLeapYear")
    public String isLeapYear(@RequestParam int year) {
        boolean isLeapYear = leapYearService.isLeapYear(year);
        return String.format("Year %d %s a leap year", year, isLeapYear ? "is" : "is not");
    }

}
