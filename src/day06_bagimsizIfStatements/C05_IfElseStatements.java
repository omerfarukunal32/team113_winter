package day06_bagimsizIfStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        /*
        Eger bir olay icin sadece iki olasilik varsa
        ve bu olasiliklardan birisi mutlaka calisacaksa
        If Else Statements kullaniriz

        If-Else Statement'da if body'si veya else body'si mutlaka calisir
        ikisinin birden calisma ihtimali YOKTUR
        ikisinin de calismama ihtimali YOKTUR
         */

        // Soru 5- Kullanicidan notunu alin
        // 50 veya daha buyukse “Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");

        double not= scan.nextDouble();

        if (not>=50 && not<=100){
            System.out.println("Sinifi gectin");
        } else {
            System.out.println("Maalesef kaldin");
        }

        // Kullanicidan pizitif bir tamsayi alin
        //sayinin tek veya cift sayi oldugunu yazdirin

        System.out.println("Pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if(sayi%2==0){
            System.out.println("Girilen sayi cift sayi");
        } else {
            System.out.println("Girilen sayi tek");
        }


        // Kullanicidan pozitif bir sayi alin
        // 5 ile bölünüp bölünmedigini yazdirin

        if (sayi%5==0){
            System.out.println("Sayi 5 ile tam bölünebilir");
        } else {
            System.out.println("Sayi 5 ile tam olarak bölünemez");
        }
    }
}
