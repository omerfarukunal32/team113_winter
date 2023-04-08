package day20_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_contains {
    public static void main(String[] args) {

        // Uzun bir Listeyi Java da List olarak kaydetmek istersek
        // tek tek eklemek istemezseniz
        // pratik olarak bir array olusturup,
        // Loop ile tüm elementleri List'e ekleyebiliriz


        int[] arr = {2,3,5,4,6,9,8,7,4,5,2,2,1,4,5,5,2,3,1,4,5,6};
        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);
        }
        System.out.println(sayilar); // [2, 3, 5, 4, 6, 9, 8, 7, 4, 5, 2, 2, 1, 4, 5, 5, 2, 3, 1, 4, 5, 6]


        // Listede element olarak 3 var mi?
        System.out.println(sayilar.contains(3)); // true

        System.out.println(sayilar.contains(10)); // false

        sayilar.clear();
        System.out.println(sayilar); // []


    }

}
