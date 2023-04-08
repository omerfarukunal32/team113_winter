package day25_passByValue_ImmutableClasses;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

public class C05_DateTime {
    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();
        System.out.println(saat); // 21:07:47.154185700

        System.out.println(saat.getNano());

        // bir loop ile 1'den 10 bin'e kadar olan sayilari toplayalim
        // ve bu islemin kac nanosamiye surdugunu bulun

        int toplam =0;

        int baslamaSuresiNano = saat.getNano();

        for (int i = 1; i <10000 ; i++) {
            toplam+=i;
        }

        LocalTime saatSon=LocalTime.now();

        int bitisSursuNano = saatSon.getNano();

        System.out.println("Islem suresi : "+(bitisSursuNano-baslamaSuresiNano));

    }
}
