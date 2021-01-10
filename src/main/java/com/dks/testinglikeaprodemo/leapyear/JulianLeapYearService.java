package com.dks.testinglikeaprodemo.leapyear;

public class JulianLeapYearService implements LeapYearService {
    @Override
    public boolean isLeapYear(int year) {
        return year % 4 == 0;
    }
}
