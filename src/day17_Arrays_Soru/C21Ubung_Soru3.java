package day17_Arrays_Soru;

import java.util.Arrays;

public class C21Ubung_Soru3 {
    public static void main(String[] args) {
        // Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        //basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        //Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));

        arr=elementleriSagaKaydir(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] elementleriSagaKaydir(int[] arr){

        int sonElement = arr[arr.length-1];
        for (int i = 0; i <arr.length-1; i++) {
            arr[arr.length-1-i]=arr[arr.length-2-i];
        }
        arr[0]=sonElement;
        return arr;
    }
}
