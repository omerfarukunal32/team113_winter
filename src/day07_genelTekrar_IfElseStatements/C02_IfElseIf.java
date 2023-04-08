package day07_genelTekrar_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen notonuzu giriniz");
        double not= scan.nextDouble();

        if(not<0 || not>100){
            System.out.println("Notunuzu yanlis girdiniz");
        } else if (not>85) {
            System.out.println("AA ile gectiniz");
        } else if (not>65) {
            System.out.println("BB ile gectiniz");
        } else if (not>50) {
            System.out.println("CC ile gectiniz");
        }else {
            System.out.println("nicht Bestanden");
        }
    }
}
