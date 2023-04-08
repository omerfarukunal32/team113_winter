package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        /*
        baslangic ve bitis degeri belli olan veya kac kez tekrar edecegi bilinen Loop'larda for Loop ideal olabilir

        Ancak tekrar sayisi belli olmayan
        baslangic veya bitisi baska bir variable'a bagli olan durumlarda
        While Loop ideal olarak kullanilir
         */

        // Soru - 50 ve 100 arasindaki (sinirlar dahil) sayilari toplayin

        int toplam=0;
        for (int i = 50; i <=100 ; i++) {
            toplam +=i;
        }
        System.out.println("Toplam: "+toplam);


        // ayni soruyu While Loop ile yapalim
        // for Loop'da 3 seyi takip edriz
        //  1- baslangic degeri
        //  2- bitis sarti
        //  3- artis veya azalis sekli
        toplam=0;
        int sayi=50;
        while (sayi<=100){
            toplam +=sayi;
            sayi++;

        }
        System.out.println("While ile toplam:"+toplam);


    }
}
