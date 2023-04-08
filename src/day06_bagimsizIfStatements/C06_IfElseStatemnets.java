package day06_bagimsizIfStatements;

import java.util.Scanner;

public class C06_IfElseStatemnets {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan yasini isteyin,
        // 65 yas ve uzeri ise “Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        double yas= scan.nextInt();

        if(yas>=65){
            System.out.println("Emekli olabilisin");
        } else {
            System.out.println("Emekli olmak icin"+" "+(65-yas)+" "+"yil calismalisin");
        }
    }
}
