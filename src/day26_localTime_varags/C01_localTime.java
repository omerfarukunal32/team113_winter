package day26_localTime_varags;

import java.time.LocalTime;

public class C01_localTime {
    public static void main(String[] args) {

        LocalTime saat1 = LocalTime.of(14,15); //  LocalTime saat =(new) burada new demiyoruz
        System.out.println(saat1);  // 20:15

        LocalTime saat = LocalTime.now();
        System.out.println(saat);  // 18:52:58.043428400   nano saniye de var

        // LocalTime objesi olan saat variable'ì canli bir saat degildir
        // olusturuldugu andaki local time'i sistemden alip kaydettigimiz sabit bir degerdir
        // kodun ilerleyen kisminda ne kadar süre gectigini gormek icin
        // saati yeniden almamiz gerekirse, yeni bir LocalTime objesi daha olusturmaliyiz

        System.out.println(saat.getHour());  // 18
        // get method'lari LocalTime objesinin saat, dakika, saniye ve nano degerlerini bize getirir

        System.out.println(saat.plusHours(2).plusMinutes(10));  // 21:08:49.738755600

        System.out.println(saat.minusMinutes(10).minusSeconds(10)); //  18:49:36.792706100

        System.out.println(saat.withSecond(10).withNano(20));  // 19:02:10.000000020

        System.out.println(saat.compareTo(saat1));  // -1
        System.out.println(saat.compareTo(saat));  // 0

        System.out.println(saat.isAfter(saat1));  // true
        System.out.println(saat.isBefore(saat1));  // false

    }
}
