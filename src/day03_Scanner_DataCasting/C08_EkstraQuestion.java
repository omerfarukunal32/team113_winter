package day03_Scanner_DataCasting;

import java.util.Scanner;

public class C08_EkstraQuestion {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alip, ücüncü bir degisken kullanmadan ikisinin degerlerini degistirin(swap)

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir tamsayi giriniz");
        int x= scan.nextInt();

        System.out.println("Lütfen baska bir sayi girin");
        int y= scan.nextInt();

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("Ilk sayinin yeni degeri:"+x + "\nIkinci sayinin yeni degeri :"+y);
    }
}
