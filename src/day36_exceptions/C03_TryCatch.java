package day36_exceptions;

public class C03_TryCatch {

    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 0;


        try {
            System.out.println(sayi1/sayi2);
            System.out.println("Deneme 1");
            System.out.println("Deneme 2");
            System.out.println("Deneme 3");
        } catch (ArithmeticException e) {
            System.out.println("Bolen sifir olmamali");
        }

        /*
            Bir try blog'unda exception olusursa
            o satirdan catch satirina kadar aradaki tum kodlar IGNORE edilir

            Eger try blog'unda exeption olusmazsa
            catch devrexe girmez
            (if-else   gibi)
         */

    }
}
