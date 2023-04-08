package day13_methodOlusturma;

import java.util.Scanner;

public class C06_MethodKullanma {
    public static void main(String[] args) {

        // Verilen bir String'in Polindrome olup olmadigini yazdirin
        // Polindrome : düzden ve tersten ayni sekilde yazilan
        // madam, 12321,

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin= scan.nextLine();
        String tersmetin = C05_StringiTerseCevirme.stringTersineCevir(metin);

        if(metin.equals(tersmetin)){
            System.out.println("Girilen metin PALINDROME");
        }else {
            System.out.println("Girilen metin POLINDROME degil");
        }
    }
}
