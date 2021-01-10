package com.dks.testinglikeaprodemo.leapyear;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GregorianLeapYearServiceGoodSnakeCaseTest {

    GregorianLeapYearService sut = new GregorianLeapYearService();

    // Introduce snake case
    // Reorder according to the most possible kind (default state 75% of time)

    @Test
    void years_not_divisible_by_4_are_not_leap_years() {
        assertThat(sut.isLeapYear(2018)).isFalse();
    }

    @Test
    void years_divisible_by_4_are_leap_years() {
        assertThat(sut.isLeapYear(2016)).isTrue();
    }

    @Test
    void years_divisible_by_100_are_not_leap_years() {
        assertThat(sut.isLeapYear(1900)).isFalse();
    }

    @Test
    void years_divisible_by_400_are_leap_years() {
        assertThat(sut.isLeapYear(2400)).isTrue();
    }

}
