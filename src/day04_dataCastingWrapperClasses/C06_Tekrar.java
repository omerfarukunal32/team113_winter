package day04_dataCastingWrapperClasses;

import java.util.Scanner;

public class C06_Tekrar {
    public static void main(String[] args) {
        String sayi="55";

        int sayi1= Integer.valueOf(sayi);
        int sayi2= Integer.parseInt(sayi);

        System.out.println(sayi1+5);
        System.out.println(sayi2+5);


    }
}
