package day22_Constructors;

import day21_arrayList_forEachLoop.C04_KarelerinToplami;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_Constructors {
    public static void main(String[] args) {
        /*
                Bir obje ancak bir class'dan olusturulabiler
                Bir obje`yi olusturdugumuz class, ayni zamanda o objenin data türüdür

                Her obje olusturuldugu class'in özelliklerini tasir

                Eger bir programda, ortak özelliklere sahip
                objeler üretmek üzere tasarladiginiz bir class varsa, MAIN METHOD Sart DEGILDiR
                Bu class'lar kaliphane gibi calisir
                Yani o class'dan ayni özelliklere sahip objeler üretmemizi saglar
         */

        Scanner scan = new Scanner(System.in);

        List<String> isimler = new ArrayList<>();

        C04_KarelerinToplami obje = new C04_KarelerinToplami();

        Random rnd = new Random(); // sayi üretiyor

        String str = new String("Ali");

        C02_Hemsire hemsire1 = new C02_Hemsire();
        System.out.println(hemsire1.mesaiUcretiHesapla(5));

        String str2;
        Random rnd2;
        List<String> harfler; // sadece referans olusturulur, obje olusmus olmaz
    }
}
