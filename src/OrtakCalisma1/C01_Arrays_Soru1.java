package OrtakCalisma1;

import java.util.Arrays;

public class C01_Arrays_Soru1 {
    public static void main(String[] args) {
        //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin.

        int[] arr1 ={1,2,3,4,5,6};
        arr1=arrayArtirma(arr1,2);
        System.out.println(Arrays.toString(arr1));

    }
    public static int[] arrayArtirma(int[] arr, int sayi){

        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=sayi;
        }
        return arr;
    }
}
