package day36_exceptions;

import java.util.Scanner;

public class C08_ThrowKeyword {

    /*
        Kodlari yazarken bazen muhtemel bir durumda
        bazi kodlarin ignore edilmesi istenebilir

        bu durumda kodlari IGNORE etme yontemi olarak
        isteyerek exception firlatip

        sonra da calismasini istedigimiz yerde
        catch ile yakalayip yolumuza devam edebiliriz

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Yasinizi giriniz: ");
        int yas = scan.nextInt();
        if (yas<0){
            System.out.println("Yas negatif olamaz");
        }
    }
}
