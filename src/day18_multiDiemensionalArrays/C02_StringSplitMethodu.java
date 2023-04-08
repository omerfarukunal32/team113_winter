package day18_multiDiemensionalArrays;

import java.util.Arrays;

public class C02_StringSplitMethodu {
    public static void main(String[] args) {


        // Bir String'i istedigimiz parcalara ayirmak icin kullanilir

        String str="Java candir, can, bundan suphesi olan var mi?";

        // str kac kelimedir?
        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));  // [Java, candir, can, bundan suphesi olan var mi?]

        System.out.println("Kelime sayisi : "+kelimeler.length);

        // en uzun kelime kac harflidir?

        int enUzunKelimelength=kelimeler[0].length();
        for (int i = 0; i <kelimeler.length-1 ; i++) {
            if(kelimeler[i].length()>enUzunKelimelength){
                enUzunKelimelength=kelimeler[i].length();
            }
        }
        System.out.println("En uzun kelimenin karakter sayisi : "+enUzunKelimelength);

        // bir string'i karakterlerine ayirmak istersek
        String[] karakterler= str.split("");

        System.out.println(Arrays.toString(karakterler));
        System.out.println("Cümledeki karakter sayisi : " + karakterler.length);  // 16



    }
}
