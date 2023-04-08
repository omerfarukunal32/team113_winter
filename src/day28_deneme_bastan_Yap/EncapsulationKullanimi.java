package day28_deneme_bastan_Yap;

import day28accessModifier_encapsulation.C03_EncapsuleDatalar;

public class EncapsulationKullanimi {

    public static void main(String[] args) {

        System.out.println(C03_EncapsuleDatalar.getIsim());
        C03_EncapsuleDatalar obj = new C03_EncapsuleDatalar();

        obj.setSatisTutari(100);
        obj.setSatisTutari(200);
        obj.setSatisTutari(300);


        System.out.println("Toplam satis :" +obj.getToplamSatis()); // 600

        // obj.=60000; baskasi degisiklik yapamaz

    }
}

/*
    C03_EncapsuleDatalar  class'indaki
    isim variable'inin degeri gorunsun ama degistirilemesin
    satisTutari ise deger girilebilsin ama girilen degerler sonradan gorulemesin

    Eger bir variable icin read veya write ozelliklerinden
    birbirinden ayrilmasi isteniyorsa
    oncelikle access modifier ile kimsenin ulamamasini saglayin

    Private yaparak kimsenin ulasamayacagini garantiye aldiktan sonra

    READ yetkisi icin getter()
    WRITE icin setter()  olusturmaliyiz



 */
