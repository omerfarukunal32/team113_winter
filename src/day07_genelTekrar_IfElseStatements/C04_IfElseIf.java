package day07_genelTekrar_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseIf {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir tasayi alin
        // sayi 3 ile tam bölünebiliyorsa "3'ün kati"
        // sayi 5 ile bölünebiliyorsa "3'ün kati"
        // sayi hem 3 hem de 5 ile bölünebiliyorsa "3 ve 5'in kati"

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen poztof bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%3==0 && sayi%5==0){
            System.out.println("3'ün ve 5'in kati");
        } else if (sayi%3==0) {
            System.out.println("3'ün kati");
        } else if (sayi%5==0) {
            System.out.println("5'in kati");
        }

        /*
        Bazen sartlar olasi tüm durumlari karsilamaz
        Bu durumda if else if bady'si ............ (yazamadim)

        else ile bitmeyen ......
         */

    }
}
