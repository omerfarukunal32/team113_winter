package day04_dataCastingWrapperClasses;

public class C04_WrapperClasses {
    public static void main(String[] args) {
        /*
        non-primitive data türlerinin hazir method`lari varken
        primitive data türlerinin hazir method`lari yoktur
        Java primitive data türleri icin kolayca gecis yapabilecekleri
        non-ürimitive data türleri olusturmustur

        int ==> Integer
        char==> Character
        byte ==> Byte
        boolean ==> Boolean

        */

        Integer sayi= 10;
        // int variableà atadigimiz degerleri atayabiliyoruz
        // arti olarak hazir method'lari var

        // variable olusturmadan da bazi method'lari kullanabiliyoruz
        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.MAX_VALUE); // 2147483647

        String sonucStr= "345";

        System.out.println(sonucStr + 10); //34510

        // bu degere 10 ekleyin

        // int sonuc=(int)(sonucStr);
        // bu durumda Wrapper Class'lar yardima yetisir

        int sonuc= Integer.parseInt(sonucStr);
        System.out.println(sonuc+10); // 355

        sonuc= Integer.valueOf(sonucStr);
        System.out.println(sonuc+10); // 355

        char krk='3';

        System.out.println(Character.isDigit(krk)); //true  (digit : hane basamak)
        System.out.println(Character.isLetter(krk)); // false

        System.out.println(Character.isAlphabetic(krk)); // false

    }
}
