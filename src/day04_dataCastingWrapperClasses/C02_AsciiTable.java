package day04_dataCastingWrapperClasses;

import java.util.Scanner;

public class C02_AsciiTable {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz:");
        char girilenHarf=scan.next().charAt(0);

        System.out.println("Girilen harf :"+girilenHarf+ "\nGirilen harften sonraki 3 harf :" +
                (char)(girilenHarf+1) +", "+
                (char)(girilenHarf+2) +", "+
                (char)(girilenHarf+3) );
    }
}
