package day16_Scope_arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniYazdirma {
    public static void main(String[] args) {
        int[] arr = {3,5,6,7,8,1,2};

        // Tüm array'i yazdirin
        System.out.println(Arrays.toString(arr)); // [3, 5, 6, 7, 8, 1, 2]

        // Tüm array'in elementlerini yanyana aralarinda bir bosluk olacak sekilde yazdirin
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");  //  3 5 6 7 8 1 2    bunlar array'in elementleri
        }

    }
}
