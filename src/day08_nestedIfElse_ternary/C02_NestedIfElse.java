package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
        // “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        // hatali giris yapilirsa kullaniciyi uyarin

        // birden fazla degiskene bagli if-Else-Statement'larini yazarken önce
        // degiskenlerden birine göre ana yapiyi olusturalim
        // bu soruda cinsiyeti ona degisken yapalim

        // Ikinci degiskeni ana degiskenin her bölümünde ayri ayri degerlendirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        double yas= scan.nextDouble();

        System.out.println("Lütfen cinsiyetinizi giriniz....."+"" +
                "\nKadin icin : K, Erkek icin : E giriniz");
        char cinsiyet=scan.next().charAt(0);

        if(cinsiyet=='k' || cinsiyet=='K'){ // Kadin
            if(yas<16 || yas>80){
                System.out.println("Gecersiz yas girisi, lütfen tekrar deneyiniz");
            } else if (yas<60) {
                System.out.println("Emekli olmak icin"+(60-yas)+" yil daha calismalisin ");
            }else {
                System.out.println("Emekli olabilirsin");
            }
        } else if (cinsiyet=='e' || cinsiyet=='E') { // Erkek
            if(yas<16 ||yas>80){
                System.out.println("Gecersiz yas girisi, lütfen tekrar deneyiniz");
            } else if (yas<65) {
                System.out.println("Emekli olmak icin"+(65-yas)+" yil daha calismalisin");
            }else {
                System.out.println("Emekli olabilirsin");
            }
        }else {
            System.out.println(" Gecersiz cinsiyet girisi, lütfen yeniden deneyin");
        }

    }
}
