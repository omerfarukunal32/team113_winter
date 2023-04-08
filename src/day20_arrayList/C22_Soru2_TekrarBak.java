package day20_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C22_Soru2_TekrarBak {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        //         liste olarak dondurecek bir method olusturun.

        System.out.println(listErstellen());

    }
    public static List<String> listErstellen(){

        Scanner scan = new Scanner(System.in);
        String girilenIsim="";

        List<String> isimler = new ArrayList<>();

        do {
            System.out.println("List icin istediginiz ismi giriniz. \nBitirmek icin q'a basin");
            girilenIsim=scan.nextLine();
            if (!girilenIsim.equalsIgnoreCase("q")){
                isimler.add(girilenIsim);
            }
        }while (!girilenIsim.equalsIgnoreCase("q"));

        return isimler;

    }

}
