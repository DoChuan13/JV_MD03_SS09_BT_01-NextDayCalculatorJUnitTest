package NextDayCalculator;

import java.time.LocalDate;
import java.time.Month;

public class NextDayCalculator {
    public static LocalDate findNextDay(int year, int month, int date) {
        //Class Local Date use to format date for Calender System
        LocalDate localDate = LocalDate.of(year, month, date);
        System.out.println("-----------------Check day-----------------");
        System.out.println("Current day =>> " + localDate);
        System.out.println("Next day =>> " + localDate.plusDays(1));
        return localDate.plusDays(1);
    }
}
