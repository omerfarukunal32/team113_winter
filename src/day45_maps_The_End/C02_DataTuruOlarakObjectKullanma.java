package day45_maps_The_End;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_DataTuruOlarakObjectKullanma {
    public static void main(String[] args) {
        List<Object> sayilar = new ArrayList<>();

        sayilar.add(4);

        sayilar.add('d');
        sayilar.add(4.3f);
        sayilar.add("JAVA");
        sayilar.add(true);
        sayilar.add(4.2);

        int[] a={3,4,5};
        sayilar.add(a);

        System.out.println(sayilar); // [4, d, 4.3, JAVA, true, 4.2, [I@43a25848]

        System.out.println(Arrays.toString(  (int[]) sayilar.get(6)));  // [3, 4, 5]   cast ettik

        System.out.println(7+6.5);

        System.out.println((Integer) sayilar.get(0)+ (Double)sayilar.get(5));  // 8.2



    }

}
