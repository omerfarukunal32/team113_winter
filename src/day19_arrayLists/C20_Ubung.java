package day19_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C20_Ubung {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(7);
        sayilar.add(8);
        sayilar.add(9);

        System.out.println(sayilar);
        System.out.println(sayilar.size());

        System.out.println(sayilar.get(sayilar.size()-1));

        sayilar.set(0,12);
        System.out.println(sayilar);

        System.out.println(sayilar.subList(3,6));
    }
}
