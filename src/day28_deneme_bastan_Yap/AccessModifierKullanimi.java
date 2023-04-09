package day28_deneme_bastan_Yap;

import day28accessModifier_encapsulation.C03_EncapsuleDatalar;

public class AccessModifierKullanimi {

    public static void main(String[] args) {

        C03_EncapsuleDatalar obj = new C03_EncapsuleDatalar();
        System.out.println(obj.a); // read
        obj.a= 100; // write

        //System.out.println(obj.satisTutari); // read
        //obj.satisTutari = 100; // write

        // C03_EncapsuleDatalar.x=20; x static degil, main method satatic
        obj.x=5;  // o sebeple o class uzerinde olusturulan bir obje ile ulastim



        /*
            Baska bir classdaki variable veya method'a ulasmak istedigimizde
            ulasmak istedigimiz class uyesinin static olup olmamasi
            erisim yöntemini etkiler
            static ise classIsmi.uyeImi
            static degilse  obje olusturup objeIsmi.uyeIsmi

            - ulasmak istedigimiz uyenin access modifier'i ise
            o uyeye ulasip ulasamayacagimizi belirler

            ulasabilirek o datayi okuyabilir veya o dataya yeni deger atayabiliriz
         */

    }


}
