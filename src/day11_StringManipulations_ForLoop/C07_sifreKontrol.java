package day11_StringManipulations_ForLoop;

public class C07_sifreKontrol {
    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa,
        // “sifre basariyla kaydedildi” yazdirin
        //        - ilk harf kucuk harf olmali
        //        - son karakter rakam olmali
        //        - sifre bosluk icermemeli
        //        - uzunlugu en az 10 karakter olmali

        // soruyu if else ile yaparsak sadece 1 hata yazdirir, ötekilere bakmaz
        // bagimsiz 4 if-else cümlesi olmali
        // en sonda 4 sarti'da sagladigini kontrol eden bir variable kulanacagiz

        int flag=0;
        String sifre="a1231121355a1";
        // - Ilk harf kücük olmali
        if(sifre.charAt(0)>='a'&&sifre.charAt(0)<='z'){
            flag++;
        }else {
            System.out.println("Ilk karakter kucuk harf olmali");
        }
        // - son karakter rakam olmali
        char sonKarakter=sifre.charAt(sifre.length()-1);
        if (sonKarakter>='0'&&sonKarakter<='9'){
            flag++;
        }else {
            System.out.println("Son karakter rakam olmali");
        }
        // - sifre bosluk icermemeli
        if(sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
        }else {
            flag++;
        }
        // - uzunlugu en az 10 karakter olmali
        if(sifre.length()>=10){
            flag++;
        }else {
            System.out.println("Sifre en az 10 karakter icermeli");
        }
        // eger tüm sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        if (flag==4){
            System.out.println("Sifre basariyla kaydedildi");
        }


    }
}
