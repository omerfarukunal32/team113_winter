package day12_forLoops;

import java.util.Scanner;

public class C22_Ubung3 {
    public static void main(String[] args) {
        /*
         * * * * * * * *
         * * * * * *
         * * * *
         * *

         */

        int satir=8;

        for (int i = satir; i >=1 ; i-=2) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
