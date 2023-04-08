package day21_arrayList_forEachLoop;

import java.util.Scanner;

public class C20_Ubung_Soru4 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        //kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin
        harfAdet();
    }
    private static void harfAdet(){

        int toplam=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle girin");
        String cumle= scan.nextLine();
        System.out.println("Bir harf girin");
        String harf= scan.nextLine().substring(0,1);
        String[] karakterler = cumle.split("");

        for (String each:karakterler
             ) {
            if (each.equalsIgnoreCase(harf)){
                toplam++;
            }
        }
        if (toplam==0){
            System.out.println("Harf cumlede yok");
        }else {
            System.out.println("Harf cumlede "+toplam+" adet vardir" );
        }
    }

}
