package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {

        // Kullanicidan toplanmak üzere sayilar alin.
        // Kullaniciya bitirmek icin 0'a basmasini söyleyim
        // Kullanici 0'a bastiginda 0 haric kac sayi girildigini ve toplamlarini yazdirin

        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int toplam=0;
        int sayiAdedi=0;

        /*
        int girilenSayi=1;
        int toplam=0;
        int sayiAdedi=0;
        while(girilenSayi!=0){
            System.out.println("Toplanmak üzere tamsayi giriniz \nBitirmek icin 0'a basunuz");
            girilenSayi= scan.nextInt();
            if(girilenSayi!=0){
                toplam += girilenSayi;
                sayiAdedi+=1;
            }
        }

         */

        do {
            System.out.println("Toplanmak üzere tamsayi giriniz \nBitirmek icin 0'a basunuz");
            girilenSayi= scan.nextInt();
            if(girilenSayi!=0){
                toplam += girilenSayi;
                sayiAdedi++;
        }   }while (girilenSayi!=0);

        System.out.println("Girilen "+sayiAdedi+" adet sayinin toplami : "+toplam);
    }
}
