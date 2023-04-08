package day11_StringManipulations_ForLoop;

public class C04_replaceAll {
    public static void main(String[] args) {

        String str="J1a23va34 5C54an65dir87";

        // str'daki sayilari method'la temizleyin

        /*
        Eger degistirmek istedigimiz metin tek bir metin degil, orak özelligi olan metinlerse

        - tüm sayilar
        - sayi olmayanlarin tümü
        - tüm space'ler
        - space olmayan tüm karakterler

        bu orak özellikleri belirtmek icin Java regex
         */
        str=str.replaceAll("\\d","");
        System.out.println(str);
    }
}
