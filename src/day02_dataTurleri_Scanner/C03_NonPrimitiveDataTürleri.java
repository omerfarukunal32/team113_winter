package day02_dataTurleri_Scanner;

public class C03_NonPrimitiveDataTürleri {
    public static void main(String[] args) {

        String isim= "Ali Can";

        String ilkHarf1="K";
        char ilkHarf2='m';

        // tek bir karakter atayacaksak ikisini de kullanabiliriz

        System.out.println(ilkHarf1.toLowerCase());
        System.out.println(ilkHarf2);

        //Primitive data türündeki variable'lar sadece Deger tasiyabilir
        //non-primitive data türündeki variable'larin hem deger hem de method'lari olur

        String metin = "asdddddddddddddddddsdad" +
                "asasdddddddddddddd" +
                "asddddddddddddddddd" +
                "asddddddddddassdfgfdg";

        String not="not";
        String Not="Variable isimlerinin büyük harfle basamasi tavsiye edilmez ama Java kabul eder. ";
        String nOT="Bir kere deklare edilen variable tekrar deklare edilmez";
        String noT="ama isimler farkli sekilde yazildigi icin Java bunlari farkli variable olarak kabul eder";

        // variable isimlerinde bosluk kullanilamaz. rakam ile baslayamaz
        // birden fazla kelime varsa "camelCase" uygulanir. Ilk harf kücük ikinci kelime bitisik ve büyük harfle baslar
        // örn: ilkHarf, ogrenciNo,....

    }
}
