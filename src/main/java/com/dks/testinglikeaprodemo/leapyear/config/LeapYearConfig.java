package com.dks.testinglikeaprodemo.leapyear.config;

import com.dks.testinglikeaprodemo.leapyear.GregorianLeapYearService;
import com.dks.testinglikeaprodemo.leapyear.JulianLeapYearService;
import com.dks.testinglikeaprodemo.leapyear.LeapYearService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class LeapYearConfig {

    @Bean
    @Primary
    public LeapYearService gregorianLeapYearService() {
        return new GregorianLeapYearService();
    }

    @Bean
    public LeapYearService julianLeapYearService() {
        return new JulianLeapYearService();
    }

}
