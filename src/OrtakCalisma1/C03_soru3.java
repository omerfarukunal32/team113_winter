package OrtakCalisma1;

import java.util.Arrays;

public class C03_soru3 {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
                basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
                Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
         */
        int[] arr ={4,5,6,7};
        arr =sagaKaydirma(arr);
        System.out.println(Arrays.toString(arr)); // [7, 4, 5, 6]
        System.out.println(arr.length); // 4
    }
    public static int[] sagaKaydirma(int[] arr){
        int sonElement = arr[arr.length-1];

        for (int i = 0; i < arr.length-1 ; i++) {
            arr[arr.length-1-i] = arr[arr.length-2-i];
        } // [4,4,5,6]
        arr[0]=sonElement;
        return arr;
    }

}
