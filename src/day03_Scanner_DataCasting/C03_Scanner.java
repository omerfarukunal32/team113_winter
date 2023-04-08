package day03_Scanner_DataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen cemberin yaricapini giriniz");

        //Kullanicinin girdigi bilgiyi kaydebilecek data türünde bir variable olusturun

        double yaricap= scan.nextDouble();

        System.out.println("Cemberin cevresi :" + 2*3.14*yaricap + "\nCemberin alani:" + 3.14*yaricap*yaricap);
    }
}
