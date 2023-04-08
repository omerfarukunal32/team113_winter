package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C25_Soru2_doWhile_Bitmedi {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
                kontrol edin ve sifredeki hatalari yazdirin.
                Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
                sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
                - Sifre kucuk harf icermelidir
                - Sifre buyuk harf icermelidir
                - Sifre ozel karakter icermelidir
                - Sifre en az 8 karakter olmalidir.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Sifre olusturunuz");
        String sifre= scan.nextLine();
        int sayac=0;

        do {
            int a=0;
            if (!(sifre.charAt(a)>='a' && sifre.charAt(a)<='z')){
                a++;
            }
            int b=0;
            if (!(sifre.charAt(b)>='A' && sifre.charAt(b)<='Z')){
                b++;
            }
            int c=0;
            String yeniSifre= sifre.replaceAll("\\w","");
            if (yeniSifre.length()==0){
                c++;
            }
            if (sifre.length()<8){
                sayac++;
            }



        }while (sayac==4);


    }
}
