package day07_genelTekrar_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseIf2 {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir tasayi alin
        // sayi 3 ile tam bölünebiliyorsa "3'ün kati"
        // sayi 5 ile bölünebiliyorsa "3'ün kati"
        // sayi hem 3 hem de 5 ile bölünebiliyorsa "3 ve 5'in kati"
        // sayi ne 3 ne de 5 ile bölünebiliyorsa "ne 3'ün ne de 5'in kati" yazdiri

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen poztof bir tamsayi giriniz");
        int sayi= scan.nextInt();
        
        if (sayi%3==0 && sayi%5==0){
            System.out.println("3 ve 5'in kati");
        } else if (sayi%3==0) {
            System.out.println("3'ün kati");
        } else if (sayi%5==0) {
            System.out.println("5'ün kati");
        } else {
            System.out.println("ne 3'ün ne de 5'in kati");
        }
    }
}
