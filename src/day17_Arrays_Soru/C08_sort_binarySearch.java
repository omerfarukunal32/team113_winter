package day17_Arrays_Soru;

import java.util.Arrays;

public class C08_sort_binarySearch {
    public static void main(String[] args) {
        // Verilen bir array'i natural order'a göre siralamak icin
        // Arrays.sort() kullanilir

        int[] arr1={3,9,6,1,7};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));  // [1, 3, 6, 7, 9]

        String[] arr2 = {"Hasan","Huseyin","Mehmet","Mesut","Mercan","ali"};
                            // [Hasan, Huseyin, Mehmet, Mercan, Mesut, ali]

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // sort yapildiktan sonra
        // array'de bir elementin var oldugunu kontrol etmek icin

        System.out.println(Arrays.binarySearch(arr2, "ali")); // 5

    }
}
