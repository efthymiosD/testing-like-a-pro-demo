package com.dks.testinglikeaprodemo.leapyear;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GregorianLeapYearServiceBadTest {

    GregorianLeapYearService sut = new GregorianLeapYearService();

    // Worst name ever
    void test() {
    }

    // Now it is better right?
    void testIsLeapYear() {
    }

    // Break your tests
    void test1() {
    }
    void test2() {
    }

    // Break domain into 2 with better naming?
    void isLeapYear() {
    }
    void isNonLeapYear() {
    }

    // Accidental cases
    @Test
    void _2016IsALeapYear() {
        assertThat(sut.isLeapYear(2016)).isTrue();
    }
    @Test
    void _2000IsALeapYear() {
        assertThat(sut.isLeapYear(2000)).isTrue();
    }
    @Test
    void _2018IsNotALeapYear() {
        assertThat(sut.isLeapYear(2018)).isFalse();
    }
    @Test
    void _1900IsNotALeapYear() {
        assertThat(sut.isLeapYear(1900)).isFalse();
    }

}