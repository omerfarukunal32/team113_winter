package day23_constructor;

public class C03_StaticKeyword {

    static String hastaneismi = "Yildiz Hastanesi";
    static String hastanetelefonu = "3122343434";
    static String bashekimismi = "Kemal Aydin";

    String persIsmi;
    String persAdresi;
    String persTelefonu;

    public static void main(String[] args) {

        C03_StaticKeyword personel1 = new C03_StaticKeyword();  // bu satiri yazdigimizda Java hemen personel1 objesini olusturacak

        System.out.println(personel1.persIsmi); // null
        System.out.println(hastaneismi);
        System.out.println(personel1.bashekimismi); // kemal




        C03_StaticKeyword personal2 = new C03_StaticKeyword();

        personal2.persIsmi="Dogan";
        System.out.println(personal2.persIsmi); // Dogan
        System.out.println(personel1.persIsmi); // null


        personal2.bashekimismi="Sumeyra Gunel";
        System.out.println(personel1.bashekimismi); // Sumeyra Gunel



        /*
            1- static variable'lar tüm class icin gecerlidir (class variable)
            2- static variable'lar tüm oljeler icin ayni degeri tasidiklari icin
               her obje icin ayrica olusturulmaz, sadece 1 variable olur
            3- static variable'lara ulasmak veya update etmek icin obje ismi kullanmaya gerek yoktur
               direk ulasilabilir
               Baska class'dan static variable'a ulasmak icin classismi staticVariableIsmi yazilir
         */
    }
}
