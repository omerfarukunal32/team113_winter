package day37_throw;

import javax.management.RuntimeErrorException;
import java.util.Scanner;

public class C01_throwKeyword {
    /*
        1- Exception : Kod calisirken handle edilebilecek sorunlarla karsilasma durumunda Java cozum onerisi bekler
        2- Bazi exception durumlarini if else ile cozulebilir. Bazen de yetersiz durumlar olabilir
        3- Exception handle etmek icin genellikle try-catch-finally kullanilir
        4- Try-catch blogu: Riskli kodlarin bulundugu ve ne yapilacaginin oldugu yer
            . try : riskli kodlarin yeri
            . Catch{} : standarttir, icine exception turu ve karsilasinca variable olusturulacagini yazdigimiz
            . Catch blogu : o exception ile karsilasinca ne yapilacagini/ hangi kodun calisacagini belirledigimiz er
        5- Iki tur exception vardir : 1. Checked(compile), 2. Unchecked(runtime)
        6- Eger birden fazla exception ile karsilasiyorsak
            . ic ice try catch kullanilir
            . bir try'a birden fazla catch baglayarak kullanilabilir (multiple-catch)
        7- Multiple catch kullanma durumunda parent-child iliskisine dikkat etmek gerekir
           Bu durumda once child exception yazilir
        8. Biz kontrollu bir exception firlatmak istersek ne yapmaliyiz

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yasinizi giriniz: ");
        int yas = scan.nextInt();
        try {
            if (yas<0){
                throw new IllegalArgumentException("Yas negatif olamaz");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
    }
}
