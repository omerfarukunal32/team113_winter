package ortakCalisma2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Soru5_List {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
        // bir liste olarak bize donduren bir method olusturun.


        fiboDöndür();

    }
    public static List<Integer> fiboDöndür() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif sayi girin");
        int girilenSayi = scan.nextInt();
        List<Integer> fibo = new ArrayList<>();
        int ilkSayi = 1;
        int ikinciSayi = 1;
        int toplam = 0;
        fibo.add(ilkSayi);
        fibo.add(ikinciSayi);

        for (int i = 2; i < girilenSayi; i++) {


            toplam = ilkSayi + ikinciSayi;
            if (toplam >= girilenSayi) {

                break;
            }
            fibo.add(toplam);
            ilkSayi = ikinciSayi;
            ikinciSayi = toplam;

        }
        System.out.println(fibo);
        return fibo;
    }
}
