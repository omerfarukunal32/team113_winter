package day20_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C24_Soru4 {
    public static void main(String[] args) {
        // Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
        //         sayisini bir list olarak donduren bir method olusturun.

        //System.out.println(fibonacciYap(5));
        System.out.println(fibonacciListe());

    }
    private static List<Integer> fibonacciListe(){
        int sayi;
        List<Integer> fibo=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Poz. bir sayi giriniz");
        sayi= scan.nextInt();
        if (sayi==1){
            fibo.add(1);
        } else if (sayi==2) {
            fibo.add(1);
            fibo.add(1);
        }else if (sayi>2){
            fibo.add(1);
            fibo.add(1);
            for (int i = 2; i <=sayi ; i++) {
                fibo.add(fibo.get(i-2)+fibo.get(i-1));
            }
        }else {
            System.out.println("Hatali giris");
        }
        return fibo;

    }







    //public static List<Integer> fibonacciYap(int sayi){
    //    Scanner scan = new Scanner(System.in);
    //    System.out.println("Pozitif bir sayi giriniz");
    //    sayi=scan.nextInt();
    //    List<Integer> newList = new ArrayList<>();
    //    if (sayi==1){
    //        newList.add(1);
    //    }
    //    if (sayi==2){
    //        newList.add(1);
    //        newList.add(1);
    //    }
    //    if (sayi>=3){
    //        for (int i = 2; i <sayi ; i++) {
    //            newList.add(1);
    //            newList.add(1);
    //            newList.set(i,newList.get(i-2)+newList.get(i-1));
    //        }
    //    }
    //    return newList;
    //}
}
