package day13_methodOlusturma;

import java.util.Scanner;

public class C23_Soru4 {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        //bolenleri sayisini bulup bize donduren bir method olusturun.
        Scanner scan=new Scanner(System.in);
        System.out.println("Gib eine Ganze Zahl ein");
        int zahl= scan.nextInt();
        System.out.println(bolenBulmaMethod(zahl));
    }
    public static Integer bolenBulmaMethod(int zahl ){

        System.out.print("Girilen "+zahl+" sayisinin bolenleri = ");
        for (int i = 1; i <zahl ; i++) {
            if (zahl%i==0){
                System.out.print(i+", ");
            }
        }
        return zahl;
    }
}
