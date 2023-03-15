package NextDayCalculator;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextDayCalculatorTest {

    @Test
    @DisplayName("Day of 2018-Jan-01")
    void checkNextDay20180101() {
        int year = 2018;
        int month = 1;
        int date = 1;
        LocalDate expect = LocalDate.of(2018, 1, 2);
        LocalDate result = NextDayCalculator.findNextDay(year, month, date);
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Day of 2018-Jan-31")
    void checkNextDay20180131() {
        int year = 2018;
        int month = 1;
        int date = 31;
        LocalDate expect = LocalDate.of(2018, 2, 1);
        LocalDate result = NextDayCalculator.findNextDay(year, month, date);
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Day of 2018-Apr-30")
    void checkNextDay20180430() {
        int year = 2018;
        int month = 4;
        int date = 30;
        LocalDate expect = LocalDate.of(2018, 5, 1);
        LocalDate result = NextDayCalculator.findNextDay(year, month, date);
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Day of 2018-Feb-28")
    void checkNextDay20180228() {
        int year = 2018;
        int month = 2;
        int date = 28;
        LocalDate expect = LocalDate.of(2018, 3, 1);
        LocalDate result = NextDayCalculator.findNextDay(year, month, date);
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Day of 2018-Dec-31")
    void checkNextDay20181231() {
        int year = 2018;
        int month = 12;
        int date = 31;
        LocalDate expect = LocalDate.of(2019, 1, 1);
        LocalDate result = NextDayCalculator.findNextDay(year, month, date);
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Day of 2020-Feb-28")
    void checkNextDay20200228() {
        int year = 2020;
        int month = 2;
        int date = 28;
        LocalDate expect = LocalDate.of(2020, 2, 29);
        LocalDate result = NextDayCalculator.findNextDay(year, month, date);
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Day of 2020-Feb-29")
    void checkNextDay20200229() {
        int year = 2020;
        int month = 2;
        int date = 29;
        LocalDate expect = LocalDate.of(2020, 3, 1);
        LocalDate result = NextDayCalculator.findNextDay(year, month, date);
        assertEquals(expect, result);
    }
}