package day17_Arrays_Soru;

import java.util.Arrays;
import java.util.Scanner;

public class C23Ubung_Soru5 {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.
        arrayOlustur();

    }
    public static String[] arrayOlustur(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Array'in boyutunu giriniz");
        int boyut= scan.nextInt();
        String[] arr = new String[boyut];

        for (int i = 0; i < boyut ; i++) {
            System.out.println("Array'in elemanlarini yazin");
            String girilenElement = scan.next();
            arr[i]= girilenElement;
        }
        System.out.println(Arrays.toString(arr));
        return arr;

    }
}
