package day38;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C05_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(61);
        sayilar.add(12);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(72);

        // cift olan sayilari silin

        Iterator it1 = sayilar.iterator();

        while (it1.hasNext()){
            int sayi = (Integer) it1.next(); // it1.next() methodu Object dondurur, o yuzden Integer'a cast yaptik
            if (sayi%2==0){
                it1.remove();
            }
        }
        System.out.println(sayilar);
    }
}
