package day13_methodOlusturma;

import java.util.Scanner;

public class C21_Soru2_ikiIsimTekrarYap {
    public static void main(String[] args) {
        /*
         Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
                Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
                isim bosluk soyisim seklinde bize donduren bir method olusturun
                input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Isminizi giriniz: ");
        String isim= scan.nextLine();
        System.out.println("Soyisminizi giriniz: ");
        String soyisim=scan.nextLine();
        System.out.println(adYazma(isim,soyisim));

    }
    public static String adYazma(String vorName,String nachName){
        String name=vorName.toUpperCase().charAt(0)+vorName.substring(1,vorName.length()).toLowerCase();
        String surName=nachName.toUpperCase().charAt(0)+nachName.substring(1,nachName.length()).toLowerCase();
        String isim=name+" "+surName;

        return isim;
    }

}
