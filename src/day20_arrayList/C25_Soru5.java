package day20_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C25_Soru5 {
    // Soru 5- Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
    //bir liste olarak bize donduren bir method olusturun
    public static void main(String[] args) {

        System.out.println(fibonacci());

    }
    private static List<Integer> fibonacci(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();
        ArrayList<Integer> fibo = new ArrayList<>();
        if (sayi<=0){
            System.out.println("Hatali giris");
        } else if (sayi==1) {
            System.out.println(fibo);
        } else if (sayi==2) {
            fibo.add(1);
            fibo.add(1);
        } else {
            int ilk=0;
            fibo.add(ilk);
            int ikinci=1;
            fibo.add(ikinci);
            int yeni = ilk+ikinci;
            fibo.add(yeni);

            while (yeni<sayi){
                ilk=ikinci;
                ikinci=yeni;
                yeni=ilk+ikinci;
                if (yeni<sayi){
                    fibo.add(yeni);
                }

            }
        }
        return fibo;

    }
}
