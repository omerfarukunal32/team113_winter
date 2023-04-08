package day26_localTime_varags;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C20_ubung {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate dogumTarihi=LocalDate.of(1988,01,01);

        Period yas = Period.between(dogumTarihi,bugun);

        System.out.println(yas.getYears());

        DateTimeFormatter trh = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        System.out.println(trh.format(bugun));

        topla(2,5);
        topla(1,1,1,1,1,1,1,1,1,1,1);

    }
    static void topla(int... a){
        int toplam=0;
        for (int each:a
             ) {
            toplam+=each;
        }
        System.out.println(toplam);
    }
}
