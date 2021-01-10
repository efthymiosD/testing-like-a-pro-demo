package com.dks.testinglikeaprodemo.leapyear;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Disabled
class GregorianLeapYearServiceSlowPerformersTest {

    @Autowired
    LeapYearService sut;

    @Nested
    @DisplayName("A year is a leap year")
    class A_year_is_a_leap_year {

        @ParameterizedTest
        @ValueSource(ints = {2016, 1984, 4})
        @DisplayName("if it is divisible by 4 but not by 100")
        void if_it_is_divisible_by_4_but_not_by_100(int year) throws InterruptedException {
            Thread.sleep(3000);
            assertThat(sut.isLeapYear(year)).isTrue();
        }

        @ParameterizedTest
        @ValueSource(ints = {2400, 400})
        @DisplayName("if it is divisible by 400")
        void if_it_is_divisible_by_400(int year) {
            assertThat(sut.isLeapYear(year)).isTrue();
        }
    }

    @Nested
    @DisplayName("A year is not a leap year")
    class A_year_is_not_a_leap_year {

        @ParameterizedTest
        @ValueSource(ints = {2018, 2017, 1043, 1})
        @DisplayName("if it is not divisible by 4")
        void if_it_is_not_divisible_by_4(int year) throws InterruptedException {
            Thread.sleep(3000);
            assertThat(sut.isLeapYear(year)).isFalse();
        }

        @ParameterizedTest
        @ValueSource(ints = {1900, 2100})
        @DisplayName("if it is divisible by 100 but not by 400")
        void if_it_is_divisible_by_100_but_not_by_400(int year) {
            assertThat(sut.isLeapYear(year)).isFalse();
        }
    }

}
