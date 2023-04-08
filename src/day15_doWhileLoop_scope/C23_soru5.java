package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C23_soru5 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
                kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.
         */
        usAlma();

    }
    public static void usAlma(){

        int yeniSayi=1;
        int sayac=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir sayi girin");
        int sayi=scan.nextInt();
        System.out.println("Pozitif bir us sayisi girin");
        int us=scan.nextInt();

        while (sayac<us){
            yeniSayi*=sayi;
            sayac++;

        }
        System.out.println(yeniSayi);


    }
}
