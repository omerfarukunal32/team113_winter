package day24_staticKeyword;

public class C02_PassByValue {

    public static void main(String[] args) {

        double fiyat = 200;


        /*
            int fiyat =500;
            String fiyat = "Java pass by value kullanir";

            Java ayni method icerisinde ayni isimde birden fazla variable
            olusturulmasina izin vermez
         */
        indirimYap10(fiyat); // 180.0
        System.out.println("method call'dan sonra fiyat : "+fiyat);  // 200.0
        indirimYap25(fiyat); // 150.0
        System.out.println("ikinci method call'dan sonra fiyat : "+fiyat); // 200.0
        System.out.println("Return yapilan fiyattan dönen fiyat : "+indirimliFiyatGetir10(fiyat)); // 180.0
        System.out.println(fiyat);  // 200.0

        // main method'daki fiyati kalici olarak degistirmek istersek
        // main method icinde atama yapmaliyiz

        fiyat=indirimliFiyatGetir10(fiyat);
        System.out.println("Main method'da atama yapildiktan sonra fiyat : "+fiyat); // 180.0

    }

    public static void indirimYap10(double fiyat){  // double fiyat = degeri methodun cagirildigi yerden

        fiyat = fiyat*0.9;
        System.out.println("%10 indirimli fiyat : "+fiyat);
    }

    public static void indirimYap25(double fiyat){
        fiyat = fiyat*0.75;
        System.out.println("%10 indirimli fiyat : "+fiyat);

    }

    public static double indirimliFiyatGetir10(double fiyat){
        fiyat = fiyat*0.9;

        return fiyat;

    }
}
