package day27_StringBuilder;

public class C03_equals_compare {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = " Java";

        // System.out.println(sb1 == str);
        // Java'da farkli data turune sahip non-primitive objeler == ile KARSILASTIRILAMAZ

        System.out.println(sb1== sb2); // false referans farkindan dolayi
        System.out.println(sb1==sb1); // true

        System.out.println(sb1.equals(sb2)); // false
        /* StringBuilder'da icerik ayni olsa bile equals metdod`u false doner
           cunku StringBuilder class'inda equals method'u yoktur
           qquals method'unu parent class'i olan Object Class'indan kullanir
           ve bundan dolayi iceriklere bakmadan false verir
         */

        System.out.println(sb1.equals(str)); // false

        // Bu durumda iki StringBuilder'in iceriklerinin ayni oldugunu kontrol etmek icin
        // compareTo() kullanilir

        System.out.println(sb1.compareTo(sb2)); // 0
        // System.out.println(sb1.compareTo(str)); // CTE

        StringBuilder sb3 = new StringBuilder("Hava");
        StringBuilder sb4 = new StringBuilder("Hara");

        System.out.println(sb1.compareTo(sb3)); // 2
        System.out.println(sb1.compareTo(sb4)); // 2
        System.out.println(sb3.compareTo(sb4)); // 4

        /*
            CompareTo() karsilastirilan StringBuilder`lar ayni metne sahip ise 0 doner
            Ayni degilse, bastan itibaren kontrole baslar
            farkli olan ilk harfin karsilastirilan kelimedeki ayni index'deki harften kac harf
            ileride  oldugunu dondurur
         */

    }
}
