package day03_Scanner_DataCasting;

import java.util.Scanner;

public class C07_ReExample {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap)

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir tamsayi giriniz");
        int x= scan.nextInt();

        System.out.println("Lütfen baska bir sayi girin");
        int y= scan.nextInt();

        int temp=y;


        y=x;
        x=temp;

        System.out.println("Ilk girilen sayinin yeni degeri :"+x+"\nIkinci girilen sayinin yeni degeri :"+y);
    }
}
