package com.dks.testinglikeaprodemo.leapyear;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GregorianLeapYearServiceGoodNestedTest {

    GregorianLeapYearService sut = new GregorianLeapYearService();

    // We can improve even more by extracting the commonality
    // Use of descriptive names

    @Nested
    @DisplayName("A year is a leap year")
    class A_year_is_a_leap_year {

        @Test
        @DisplayName("if it is divisible by 4 but not by 100")
        void if_it_is_divisible_by_4_but_not_by_100() {
            assertThat(sut.isLeapYear(2016)).isTrue();
        }

        @Test
        @DisplayName("if it is divisible by 400")
        void if_it_is_divisible_by_400() {
            assertThat(sut.isLeapYear(2400)).isTrue();
        }

    }

    @Nested
    @DisplayName("A year is not a leap year")
    class A_year_is_not_a_leap_year {

        @Test
        @DisplayName("if it is not divisible by 4")
        void if_it_is_not_divisible_by_4() {
            assertThat(sut.isLeapYear(2018)).isFalse();
        }

        @Test
        @DisplayName("if it is divisible by 100 but not by 400")
        void if_it_is_divisible_by_100_but_not_by_400() {
            assertThat(sut.isLeapYear(1900)).isFalse();
        }

    }

}
