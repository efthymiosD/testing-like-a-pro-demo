package com.dks.testinglikeaprodemo.leapyear;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GregorianLeapYearServiceGoodMutualExclusiveTest {

    GregorianLeapYearService sut = new GregorianLeapYearService();

    // Test cases should have mutual exclusive names to not overlap

    @Test
    void years_not_divisible_by_4_are_not_leap_years() {
        assertThat(sut.isLeapYear(2017)).isFalse();
    }

    @Test
    void years_divisible_by_4_but_not_by_100_are_leap_years() {
        assertThat(sut.isLeapYear(2016)).isTrue();
    }

    @Test
    void years_divisible_by_100_but_not_by_400_are_not_leap_years() {
        assertThat(sut.isLeapYear(2100)).isFalse();
    }

    @Test
    void years_divisible_by_400_are_leap_years() {
        assertThat(sut.isLeapYear(2400)).isTrue();
    }

}
