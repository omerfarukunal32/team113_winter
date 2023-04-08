package day13_methodOlusturma;

import java.util.Scanner;

public class C22_Soru3_TekrarYap {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
        // Girilen sayinin asal sayi olup olmadigini kontrol edip,
        // sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.
        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();
        System.out.println(asalSayimi(girilenSayi));
    }
    public static String asalSayimi(int girilenSayi){
        int sayac = 0;
        String a = "";
        for (int i = 2; i < girilenSayi; i++) {
            if (girilenSayi % i == 0) {
                sayac++;
            }
        }
        if (girilenSayi == 1) {
            a= "Asal degildir";
        }else if (girilenSayi == 2 ) {
            a = "Asaldir";
        } else if (sayac==0) {
            a = "Asaldir";
        } else {
            a= "Asal degildir";
        }
        return a;
    }

}
