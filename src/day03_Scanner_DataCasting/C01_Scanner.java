package day03_Scanner_DataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //  Isminiz : John
        //  Soyisminiz : Doe
        //  Yasiniz : 44
        //  Kaydiniz basariyla tamamlanmistir.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");

        String isim=scan.nextLine();

        System.out.println("Lütfen soyisminizi yaziniz");

        String soyisim=scan.nextLine();

        System.out.println("Lütfen yasinizi giriniz");

        double yas = scan.nextDouble();

        /*
        System.out.println("Isminiz :"+"" + isim );
        System.out.println("Soyisminiz :" +"" +soyisim);
        System.out.println("Yasiniz :"+"" +yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir");

         */

        // Kullanici istedigimiz data türünde bilgi girisi yapmazsa kodunuzda hata olusur
        // ve calisma durur. ilerde kullanici hatalarina karsi nasil tedbirler alacagimizi ögrenecegiz.
        // Simdilik kullanici biz ne diyorsak onu tam yapiyor kabul edelim.

        /*
        System.out.print("Isminiz :"+"" + isim );
        System.out.print("Soyisminiz :" +"" +soyisim);
        System.out.print("Yasiniz :"+"" +yas);
        System.out.print("Kaydiniz basariyla tamamlanmistir");

        System.out.printLn()' deki Ln yazdirma islemini yaptiktan sonra alt satira gecmesini saglar
        printLn yerini#e printLn yazarsak yazdirdiginiz seyler yanyana yazdirilir
         */

        System.out.println("Isminiz :" + isim+
                "\nSoyisminiz :" +    soyisim+
                "\nYasiniz : " +      yas+
                "\nBasariyla yapilmistir");

        /*
        Tek bir System.out.println() ile birden fazla satir yazdirmak isterseniz
        String bir ifadenin icinde istedigimiz yere \n yazabilirsiniz
         */

    }
}
