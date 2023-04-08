package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C22_soru4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin. Kullaniciya bitirmek
                istediginde 0'a basmasini soyleyin
                Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini ve
                bunlarin toplaminin kac oldugunu yazdirin
                Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
                negatif sayiyi sayi adedine ve toplama eklemeyin
         */
        Scanner scan=new Scanner(System.in);



        int toplam=0;
        int sayiAdedi=0;
        int girilenSayi=1;

        while (girilenSayi!=0){
            System.out.println("Toplanmak üzere sayi girin, bitirmek icin 0' a basin");

            girilenSayi= scan.nextInt();
            if (girilenSayi>0){
                toplam+=girilenSayi;
                sayiAdedi++;
            }
            if (girilenSayi<0){
                System.out.println("Negatif bir deger giremezsiniz");
            }


        }
        if (girilenSayi==0){
            System.out.println("toplam "+sayiAdedi+" adet girilen sayinin toplami : "+toplam);

        }


    }
}
