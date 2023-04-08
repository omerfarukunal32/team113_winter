package day04_dataCastingWrapperClasses;

public class C01_AsciiTable {
    public static void main(String[] args) {
        /*
        24 ==> 11000  (24 ü 2lik tabana cevirme)
        a ==> 97 ==> 10100010
        b ==> 98
         */

        // char data türündeki variable ve degerler
        // sayisal data türlerine atanirsa veya
        // sayisal data türündeki datalarla isleme sokulursa
        // ASCII table'daki degerleri ile isleme girer

        System.out.println(5+'a'); // 5 + 97 = 102

        char ilkHarf = 101;
        System.out.println(ilkHarf); // e (ASCII tablosundan)

        // Soru - Kullanicinin verdigi harften bir sonraki harfi yazdirin

        char girilenChar = 'f';

        System.out.println(girilenChar+1); // 102 + 1 =103
        // biz 103'ü degil 103'ün karsiligi olan char ifadeyi yazdirmak istersek; explicit casting yapariz
        System.out.println("Girilen harfin bir sonrasi: "+(char)(girilenChar+1)); //e

        // Soru - Verilen bir harften 2 önceki harfi yazdirin

        girilenChar='M';

        System.out.println(girilenChar-2); //77 - 2 =75
        System.out.println("Verilen harfin iki önceki harf:"+(char)(girilenChar-2)); //K

    }
}
