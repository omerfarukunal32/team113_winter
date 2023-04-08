package day22_Constructors;

import java.util.Random;

public class C21_Ubung2 {
    public static void main(String[] args) {
        C04_Doktor dktr = new C04_Doktor();
        dktr.isim="ali";
        dktr.soyIsim="Kilic";
        dktr.telNo="123456";
        System.out.println(dktr.toString());

        C04_Doktor dktr2 = new C04_Doktor("Ali","Kara",33,'E');

        System.out.println(dktr2.isim);

        C04_Doktor dktr3;
        System.out.println(new C04_Doktor().izindeMi);


    }

}
