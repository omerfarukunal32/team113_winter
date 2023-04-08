package day22_Constructors;

public class C03_hemsireRunner {
    public static void main(String[] args) {
        /*
                Bir obje olustururken parametre olarak hicbir deger girilmez ise
                olusturulan obje, olusturuldugu class'daki variable' lara atanan degeri alir
                Eger obje olusturulan class'da deger atamasi yoksa, Java default degerleri atar
         */

        C02_Hemsire hemsire1 = new C02_Hemsire();

        System.out.println(hemsire1.isim); // Isim atanmamis
        System.out.println(hemsire1.evliMi); // hiclik
        System.out.println(hemsire1.yas); // 0
        System.out.println(hemsire1.izindeMi); // false

        hemsire1.isim="Tuba";
        hemsire1.yas=29;

        System.out.println("============================================");
        System.out.println(hemsire1.isim); // Tuba
        System.out.println(hemsire1.yas); // 29
    }
}
