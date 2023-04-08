package day13_methodOlusturma;

import java.util.Scanner;

public class C02_IkiSayiToplama {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alip toplamlarini yazdiran bir method olusturun

        ikiSayiTopla();  //methodcall, methodlar cagirilmadan calismaz
        ikiSayiTopla();  // method kac kere cagirilirsa o kadar calisir
    }

    public static void ikiSayiTopla(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Toplamak üzere 2 sayi giriniz");
        double sayi1= scan.nextByte();
        double sayi2= scan.nextDouble();

        System.out.println("Iki sayinin toplami : "+(sayi1+sayi2));
    }
}
