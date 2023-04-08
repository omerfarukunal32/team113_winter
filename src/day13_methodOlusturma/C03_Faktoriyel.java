package day13_methodOlusturma;

public class C03_Faktoriyel {
    public static void main(String[] args) {

        // verdigimiz bir sayinin faktoriyelini hesaplayip
        // sonucu bize döndüren bir method olusturun

        int sonuc=faktoriyelHesapla(5);
        System.out.println(sonuc);
        /*
                Method oluturma asamalari
                1- public static standart(simdilik)
                2- olusturdgumuz method bize bir sonuc döndürecekse döndürecegi sonucun türünü yaz
                3- method ismi
                4- method parantezi() icine method'a göndermemiz gereken bilgieri
                   hangi variable ile göönderecegimizi yaz. (parametre)
                5- döndürülmesi istenen islemi yap
                6- return keyword kullanarak döndürülmesi istenen degeri döndür
         */
    }
    public static int faktoriyelHesapla(int sayi){  //5
        int faktoriyel=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoriyel *=i;

        }
        return faktoriyel;

    }

}
