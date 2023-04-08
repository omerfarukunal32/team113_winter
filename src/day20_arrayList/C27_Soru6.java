package day20_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C27_Soru6 {
    public static void main(String[] args) {
        // Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
        //tamsayilari bir liste olarak bize donduren bir method olusturun
        System.out.println(bolenler());
    }
    private static List<Integer> bolenler(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();
        List<Integer> liste = new ArrayList<>();
        if (sayi<=0){
            System.out.println("Pozitif bir sayi girilmedi");
        }else {
            for (int i = 1; i <=sayi ; i++) {
                if (sayi%i==0){
                    liste.add(i);
                }
            }
        }
        return liste;
    }
}
