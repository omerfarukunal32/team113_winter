package day38;

import java.util.ArrayList;
import java.util.List;

public class C04_Iterator {
    public static void main(String[] args) {
        /*
            Java'da Collections konusunda ogrenecegimiz Set gibi bazi yapilar index desteklemez

            Bu drumda Index olmadigindan elementleri yazdirmak istersek
            for-each loop kulanabiliriz

            Ancak elementler arasinda dolasmak, belirli sartlari saglayanlari
            update etmek isterseniz, for-each loop ile yapamazsiniz.

            Hatta List'de istenmeyen elementleri silmek istedigimizde
            her sildigimiz element uzunlugu degistirdigi icin
            kodlar saglikli calismaz

            Bu sorunlari cozmek icin Iterator interface'ini olusturmustur

         */

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(6);
        sayilar.add(12);
        sayilar.add(14);
        sayilar.add(4);
        sayilar.add(72);

        // cift olan sayilari silin

        for (int i = 0; i <sayilar.size() ; i++) {
            if (sayilar.get(i)%2==0){
                sayilar.remove(i);
            }
        }
        System.out.println(sayilar);
    }
}
