package com.dks.testinglikeaprodemo.leapyear;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GregorianLeapYearServiceGoodTest {

    GregorianLeapYearService sut = new GregorianLeapYearService();

    // There are 4 kinds of year in the system of classification

    @Test
    void yearsDivisibleBy4AreLeapYears() {
        assertThat(sut.isLeapYear(2016)).isTrue();
    }

    @Test
    void yearsDivisibleBy400AreLeapYears() {
        assertThat(sut.isLeapYear(2400)).isTrue();
    }

    @Test
    void yearsNotDivisibleBy4AreNotLeapYears() {
        assertThat(sut.isLeapYear(2019)).isFalse();
    }

    @Test
    void yearsDivisibleBy100AreNotLeapYears() {
        assertThat(sut.isLeapYear(2100)).isFalse();
    }

}
