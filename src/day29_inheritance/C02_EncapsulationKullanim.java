package day29_inheritance;

public class C02_EncapsulationKullanim {
    public static void main(String[] args) {

        C01 obj = new C01();

        obj.isim="Melike"; // write
        System.out.println(obj.isim); // read

        obj.setSayi(40);  // write
        System.out.println(obj.getSayi()); // read

        /*
            Bir class uyesinin public olmasi ile
            private yapilip getter ve setter methodlarinin olusturulmasi
            islevsel acidan ayni sonucu olustrur

            Bazi developer'lar set(write) ve get(read) yetkilerinin
            kullanildigini vurgulamak icin ikinci yontemi tercih ederler

         */

    }
}
