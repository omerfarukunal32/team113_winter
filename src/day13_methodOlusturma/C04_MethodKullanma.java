package day13_methodOlusturma;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {
        // Kullanicidan 10'dan kücük iki pozitif tamsayi alip faktoriyel degerlerini toplayin

        Scanner scan=new Scanner(System.in);
        System.out.println("10'dan kücük iki adet poozitif tamsayi girin");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        int sonuc= C03_Faktoriyel.faktoriyelHesapla(sayi1)+ C03_Faktoriyel.faktoriyelHesapla(sayi2);
        System.out.println(sonuc);
    }
}
