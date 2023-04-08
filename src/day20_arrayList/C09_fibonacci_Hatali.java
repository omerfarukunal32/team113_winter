package day20_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_fibonacci_Hatali {
    public static void main(String[] args) {
        // Soru 4- Verilen pozitif bir n tamsayisini alarak,
        //         bize ilk n tane tane Fibonacci sayisini bir list olarak donduren bir method olusturun.

        //  0 1 1 2 3 5 8 13 21 34 55 89.............

        int sayiAdedi = 10;
        System.out.println(fibonacciSayisiYazdirma(10)); // [0, 0, 1, 2, 3, 5, 8, 13, 21, 34, 55]
        System.out.println(fibonacciSayisiYazdirma(15));


    }
    public static List<Integer> fibonacciSayisiYazdirma(int sayiAdedi){

        List<Integer> fibonacciSerisi = new ArrayList<>();
        if (sayiAdedi<=0){
            System.out.println("Yanlis Giris");
        }else if (sayiAdedi==1){
            fibonacciSerisi.add(0);
        }else if (sayiAdedi==2){
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        }else {
            int ilkSayi=0;
            fibonacciSerisi.add(ilkSayi);
            int ikinciSayi= 1;
            fibonacciSerisi.add(ikinciSayi);
            int yeniSayi = ilkSayi+ikinciSayi;
            fibonacciSerisi.add(yeniSayi);

            while (fibonacciSerisi.size()<=sayiAdedi) {

                ilkSayi=ikinciSayi;
                ikinciSayi=yeniSayi;
                yeniSayi=ilkSayi+ikinciSayi;
                fibonacciSerisi.add(yeniSayi);
            }
        }
        return fibonacciSerisi;

    }
}
