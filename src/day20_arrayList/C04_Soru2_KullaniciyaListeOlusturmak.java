package day20_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_Soru2_KullaniciyaListeOlusturmak {
    public static void main(String[] args) {
        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.
        System.out.println(kullaniciyaListOlusturtma());

    }
    public static List<String> kullaniciyaListOlusturtma(){

        List<String> isimler = new ArrayList<>();
        String girilenIsim="";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Listeye eklenmek icin bir isim girin"+"\nBitirmek icin q'ya basin");
            girilenIsim = scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")){
                isimler.add(girilenIsim);
            }

        }while (!girilenIsim.equalsIgnoreCase("q"));

        return isimler;
    }
}
