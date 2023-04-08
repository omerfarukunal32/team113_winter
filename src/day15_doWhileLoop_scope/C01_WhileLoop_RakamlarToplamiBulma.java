package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C01_WhileLoop_RakamlarToplamiBulma {
    public static void main(String[] args) {
        // While Loop kullanarak kullanicidan alinan sayinin rakamlar tolamini bulun
        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        int sayi=girilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        while (sayi>0){
            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;
        }

        System.out.println("Girilen "+girilenSayi+" 'nin rakamlar toplami :"+rakamlarToplami);


    }
}
