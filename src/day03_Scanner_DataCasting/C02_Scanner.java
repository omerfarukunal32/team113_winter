package day03_Scanner_DataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Soru 5 - Kullanicidan ismini, soyismini ve yasini alip sagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44

        Scanner scan = new Scanner(System.in);

        // isterseniz tek bir aciklama ile 3 bilgiyi de alabilisiniz

        System.out.println("Lütfen isminizi, soyisminizi ve yasinizi giriniz" +
                "\n Herbilgiden snra enter'a basin");

        char isimIlkHarf =scan.nextLine().charAt(0);

        /*
        Scanner method'larinda nextChar() yok
        bunun icin once kullanicinin girisine göre next() veya nextLine() yazip sonra .charAt(0) yazariz.
        Parantez icindeki 0, almak istedigimiz char'in index'idir ve Java'da index 0'dan baslar
         */

        String soyisim=scan.nextLine();
        double yas= scan.nextDouble();

        System.out.println("Girilen bilgiler :" +" "+ isimIlkHarf+ " "+ soyisim+ ", "+ yas );


    }
}
