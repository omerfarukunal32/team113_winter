package day26_localTime_varags;

import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih); // 2023-03-09

        System.out.println(tarih.isLeapYear()); // false

        LocalDate tarih2 = LocalDate.of(2220,10,10);

        System.out.println(tarih2.isLeapYear());  // true

        System.out.println(tarih.plusWeeks(20).plusDays(2));  // 2023-07-29

        System.out.println(tarih.withYear(1923).withMonth(5)); // 1923-05-09
        System.out.println(tarih.getDayOfYear()); // 68

        System.out.println(tarih.getMonth());  // MARCH
        System.out.println(tarih.getMonthValue()); // 3

        LocalDate tarih3 = LocalDate.of(1986,8,10);
        System.out.println(tarih3.getDayOfWeek());  // Sunday


    }
}
