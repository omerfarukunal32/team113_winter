package OrtakCalisma1;

import java.util.Arrays;
import java.util.Scanner;

public class C05_Soru5 {
    public static void main(String[] args) {
       /*
    Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
            donduren bir method olusturun.
     */
        boyutElement();

    }
    public static int[] boyutElement(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Array'in boyutunu giriniz");
        int boyut= scan.nextInt();
        int [] yeniArr = new int[boyut]; // yeni array olsturmak icin yapilan komut

        for (int i = 0; i <boyut ; i++) {

            System.out.println("Lütfen Array'in Elementlerini giriniz");
            int girilenElement = scan.nextInt();
            yeniArr[i] =girilenElement;
        }
        System.out.println(Arrays.toString(yeniArr));
        return yeniArr;
    }

}
