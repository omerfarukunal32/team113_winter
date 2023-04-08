package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_ScannerIlkGorev {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve sayinin karesini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lüfen bir sayi girin");
        double sayi= scan.nextDouble();

        System.out.println("Girilen sayinin karesi :" + sayi*sayi);
    }
}
