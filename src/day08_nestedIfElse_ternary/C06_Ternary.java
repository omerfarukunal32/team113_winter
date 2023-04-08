package day08_nestedIfElse_ternary;

public class C06_Ternary {
    public static void main(String[] args) {

        // Ternary operatörü ya direkt sout icerisinde kullamilir
        // ya da bir degiskene atama yapilacak sekilde yazilir

        int sayi=19;

        // sayi%2==0 ? "sayi cift":"sayi tek";    bu sekilde yazilirsa Java hata verir

        System.out.println(sayi%2==0 ? "sayi cift":"sayi tek");

        String sonuc= sayi%2==0 ? "sayi cift":"sayi tek";

        // Eger true oldugundaki sonuc ile false oldugunda ki sonuc
        // farkli data türlerinde olursa yazdirilabilir ama atama yapilamaz

        // sayi cift ise "sayi cift" yazdirin
        // degilse sayinin iki katini yazdirin

        System.out.println(sayi%2==0 ? "sayi cift":2*sayi);

        // int sonuc2=sayi%2==0 ? "sayi cift":2*sayi   (farki data türüne atamasi yapilamiyor)
    }
}
