package day03_Scanner_DataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        // Kullanici sayi1=10, sayi2=20 degeri girdiginde
        // sayi1'in yeni degeri =20, sayi2'in yeni degeri =10

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen sayi1'i giriniz (Tamsayi):");

        int sayi1= scan.nextInt();

        System.out.println("Lütfen sayi2'yi giriniz(Tamsayi):");

        int sayi2=scan.nextInt();

        int temp=0;

        temp=sayi2;

        sayi2=sayi1;

        sayi1=temp;

        System.out.println("sayi1' in yeni degeri:" +sayi1);
        System.out.println("sayi2' in yeni degeri:" +sayi2);



    }
}
