package day06_bagimsizIfStatements;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Ücgenin kenar uzunluklarini girin. Her sayi girisi sonrasi enter'a basin");

        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        /*
        Java'da 3'lü karsilastirma yoktur.
        onun yerine ikili karsilastirmalar yapip && ile birlestirebiliriz
         */
        if(kenar1==kenar2 && kenar2==kenar3 &&kenar1>0){
            System.out.println("Girilen kenarlar bir eskenar ücgen olusturur");
        }
    }
}
