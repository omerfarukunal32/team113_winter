package day13_methodOlusturma;

import java.util.Scanner;

public class C20_Ubung_Soru1 {
    public static void main(String[] args) {

        /*
        Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
                baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
                bir method olusturun.
                    - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
                      mesaji verin
                    - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
                      yazdirin.
         */

        indexYazma();
    }
    public static void indexYazma(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String input=scan.nextLine();
        System.out.println("Baslangic index'i girin");
        int bas= scan.nextInt();
        System.out.println("Bitis index'i girin");
        int bit= scan.nextInt();

        if (bas>bit){
            System.out.println("Hatali giris");
        } else if (bas>input.length()||bit>input.length()) {
            System.out.println("Baslangic index'i Stringden büyük olamaz");
        }else {
            System.out.println(input.substring(bas, bit));
        }

    }
}
