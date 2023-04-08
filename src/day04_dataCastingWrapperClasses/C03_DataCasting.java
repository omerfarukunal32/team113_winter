package day04_dataCastingWrapperClasses;

public class C03_DataCasting {
    public static void main(String[] args) {
        int a=20;
        int b=6;

        System.out.println(a/b); // 3

        // Java bölünen iki sayi tamsayi ise sonucun da tamsayi kismini verir.

        double c = 6;
        System.out.println(a/c); //3.3333333333333335

        // Bölünen sayilarin data türleri farkli ise sonucu daha genis olanin cinsinden verir.

        float d=6f;

        System.out.println(a/d); // 20 / 6 = 3.3333333

        // Soru - a/b isleminin sonucunu ondalikli olarak nasil yazdirabiliriz?

        System.out.println((double) (a/b)); //3.0 (Buradaki islem önceligi (a/b)'dedir)

        // Java öncelikle (a/b) islemini yapar ve sonucu 3 bulur
        // sonra (double) oldugundan 3'ü cast eder ve 3.0 bulur
        //Bölme isleminin sonucunun double olmasi icin isleme girenlerden birisi double olmalidir

        System.out.println((double) a/b ); //3.3333333333333335
        System.out.println(a/(double)b);    //3.3333333333333335

        int e= 1467;

        System.out.println(e=e/10); // 146  (Java yazdirma islemi öncesi atama islemi yani sag tarafi yapar.)

        System.out.println(e); // 146

        e=e/10;
        System.out.println(e); // 14  (146 / 10 = 14,6 ancak 14 ü e ya atama yapar)

        e=e/10;
        System.out.println(e); // 1

        e=e/10;
        System.out.println(e); // 0


    }
}
