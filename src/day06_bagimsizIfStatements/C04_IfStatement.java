package day06_bagimsizIfStatements;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse “Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");

        double not= scan.nextDouble();

        if (not>=50 && not<=100){
            System.out.println("Sinifi gectin");
        }
        if(not<50){
            System.out.println("Maalesef kaldin");
        }

        /*
        If statement'da sart parantezinden sonra süslü parantez kullanmazsak
        Java ilk ; 'e kadar olan kismi if body olarak kabul eder

        If bady zaten 1 satir ise bu bir sorun olmaz
        ama If bady 1 satirdan coksa, ilk satirdan sonrasi her durumda calisir
         */
    }
}
