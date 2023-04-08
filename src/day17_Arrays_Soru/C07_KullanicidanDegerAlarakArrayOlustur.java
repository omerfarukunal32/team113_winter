package day17_Arrays_Soru;

import java.util.Arrays;
import java.util.Scanner;

public class C07_KullanicidanDegerAlarakArrayOlustur {
    public static void main(String[] args) {
        // Kullanicidan array olusturmak üzere pozitif tamsayilar alin
        // Kulaniciya islemi bitirmesi icin 0 a basmasi gerektigini söyleyin
        // bir önceki class'dan method kullanarak aldiginiz elementleri array'e ekleyin

        Scanner scan=new Scanner(System.in);
        int girilenSayi=1;
        int[] arr=new int[0]; //[]

        while (girilenSayi != 0){
            System.out.println("Array'e eklemek icin pozitif tamsayilar girin" +
                    "\nislemi bitirmek icin 0'a basin");
            girilenSayi = scan.nextInt();
            if (girilenSayi !=0){
                arr=C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr,girilenSayi);
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
