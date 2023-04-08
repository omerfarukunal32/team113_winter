package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C04_TernatyOperator {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir tamsayi alin.
        // sayi cift ise "Sayi cift"
        // degilse "Tek sayi" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if(sayi%2==0){
            System.out.println("Cift sayi");
        }else {
            System.out.println("Tek sayi");
        }

        System.out.println(sayi%2==0?"Cift sayi" :"Tek sayi");
    }
}
