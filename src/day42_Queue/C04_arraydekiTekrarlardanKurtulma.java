package day42_Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C04_arraydekiTekrarlardanKurtulma {
    public static void main(String[] args) {
        /*
            Verilen bir array'deki tekrar eden elementleri sadece bir kere yazdirarak
            array'i kisaltan bir kod yazininiz.
            hint: Set kullaniniz
            int[] arr = {1,2,1,3,4,5,1,2,6,2,3,4,5,1,3,2,6,5,7}
         */
        int[] arr = {1,2,1,3,4,5,1,2,6,2,3,4,5,1,3,2,6,5,7};
        Set<Integer> tekrarsizSet = new TreeSet<>(); // Set küme mantig ile herbir elemani 1 defa kaydeder

        for (int each:arr
             ) {
            tekrarsizSet.add(each);
        }
        System.out.println(tekrarsizSet);
        arr=new int[tekrarsizSet.size()];
        int index =0;
        for (Integer each:tekrarsizSet
             ) {
            arr[index]=each;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
