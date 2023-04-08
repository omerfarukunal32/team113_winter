package day06_bagimsizIfStatements;

import java.util.Scanner;

public class C08_IfElseStatement {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir karakter isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter girin");
        char krk=scan.next().charAt(0);

        if('a'<=krk && krk<='z'){
            System.out.println(Character.toUpperCase((krk)));
        } else {
            System.out.println(krk);
        }
    }
}
