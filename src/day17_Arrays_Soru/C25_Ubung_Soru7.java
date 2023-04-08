package day17_Arrays_Soru;

import java.util.Arrays;

public class C25_Ubung_Soru7 {
    public static void main(String[] args) {
        // Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //         eski array’e yeni degeri atayin.

        String[] arr = new String[3];
        arr[0]="Ali";
        arr[1]="Osman";
        arr[2]="Veli";
        System.out.println(Arrays.toString(arr));
        arr=ArrayElemanEkle(arr,"Umit");
        System.out.println(Arrays.toString(arr));
    }
    public static String[] ArrayElemanEkle(String[] arr, String eklenecekIsim){
        String[] yeniArr= new String[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekIsim;
        return yeniArr;
    }
}
