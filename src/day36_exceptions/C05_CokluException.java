package day36_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_CokluException {

    public static void main(String[] args) {

        String str="Java her gecen gun guzellesiyor";
        int[] arr = {3,4,6,3,6,7,4,2,5,7};

        // Kullanicidan 0 veya pozitif bir tamsayi isteyin
        // girilen degeri index olarak kullanip
        // str ve arr'nin  o index'indeki elemanlari yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Index olarak kullanmak icin 0 veya pozotof bir tamsayi girin");

        /*
            Birbirinden bagimsiz
            3 farkli turde exception riski var
            bunlari farkli sekillerde handle edebiliriz
            1- Herbirini try-catch yapariz
            2- Tek bir try, birden fayla catch yapabilirsiniz

         */

        try {
            int index = scan.nextInt();

            System.out.println(str.charAt(index));

            System.out.println(arr[index]);
        } catch (RuntimeException e) {
            //System.out.println("Giris hatali olabilir, index String veya Array'in disinda olabilir");
            e.printStackTrace();
            // biz mesaj yazacaksak genel bir mesaj yazabiliriz
            // veya java'nin hata kodlarini yazdirabiliriz
        }


        try {
            int index = scan.nextInt();

            System.out.println(str.charAt(index));

            System.out.println(arr[index]);
        } catch (InputMismatchException e) {
            System.out.println("Tamsayi girmelisin");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Girilen index String sinirlari disinda");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Girilen index Array sinirlari disinda");
        }
    }
}
