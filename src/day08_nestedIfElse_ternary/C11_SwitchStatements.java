package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C11_SwitchStatements {
    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin
        // o harfle baslayan gün ismi varsa yazdirin
        // yoksa gecersiz harf yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        harf=Character.toUpperCase(harf);

        if(harf=='P'){
            System.out.println("Pazartesi, Persembe veya Pazar");
        } else if (harf=='S') {
            System.out.println("Sali");
        } else if (harf=='C') {
            System.out.println("Carsamba, Cuma veya Cumartesi");
        }else {
            System.out.println("Gecersiz harf");
        }


        System.out.println("================================");
        // daha düzenli ve kullanisli olarak switch statements kullanabiliriz
        // switch statements, swutch'in önünde yazilan degiskene esit olan case'i calistirir
        // calismaya basladiktan sonra
        // break görünceye kadar veya switch'in sonuna kadar calisir

        switch (harf){
            case 'P' :
                System.out.println("Pazartesi, Persembe veya Pazar");
                break;
            case 'S':
                System.out.println("Sali");
                break;
            case 'C':
                System.out.println("Carsamba, Cuma veya Cumartesi");
                break;
            default:
                System.out.println("Gecersiz harf");
        }

    }
}
