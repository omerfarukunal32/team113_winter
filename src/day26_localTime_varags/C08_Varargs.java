package day26_localTime_varags;

import java.util.Arrays;

public class C08_Varargs {
    public static void main(String[] args) {

        topla(3,4);  // [3, 4] Toplam : 7
        topla(3,4,5); // [3, 4, 5]  Toplam : 12
        topla(3,4,5,6); // [3, 4, 5, 6]  Toplam : 18
        topla(1,2,3,4,5,6); // [1, 2, 3, 4, 5, 6]  Toplam : 21
        topla(1,2,3,4,5,6,7,8,9); // [1, 2, 3, 4, 5, 6, 7, 8, 9]  Toplam : 45

    }

    public static void topla(int... sayi) {
        System.out.println(Arrays.toString(sayi));

        int toplam=0;
        for (int each:sayi
             ) {
            toplam +=each;
        }
        System.out.println("Toplam : "+toplam);
    }

    /*
        Java'da bir method parametrelerine uygun argumente sahip
        method call oldugunda calisir

        Ornegin 2 int parametre varsa
        sadece 2 int argument ile method call yapildiginda calisir

        Java ayni data turune sahip olamak sartiyla
        parametre sayisini esnek tutabilmek icin varargs olusturmustur

        varargs bir ARRAY'dir

        dolayisiyla method'da array elementlerini
        istedigimiz isleme uygun olarak kullanabiliriz
     */
}
