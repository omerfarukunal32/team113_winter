package day15_doWhileLoop_scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
            While Loop'da biria sarti kontrlu her zaman bady'den bir fazla calisir
            while Loop'da kullanicidan alacagimiz degerlere önce bizim deger atamamiz gerekir
            bu da bazan  hatalara sebep olur
         */

        int sayi=-10;
        int toplam=0;
        while (sayi>0){

            toplam+=sayi*sayi;
            sayi--;

        }
        System.out.println("while toplam: "+toplam);
        // doWhileLoop da ilk basta kontrol yapmadigi icin sart tutmasa bile ilk kez calisir. yerine göre
        // hangisini kullanacagimizi secmeliyiz

        sayi=-10;
        toplam=0;
        do{
            toplam+=sayi*sayi;
            sayi--;
        }while (sayi>0);

        System.out.println("doWhileToplam: "+toplam);

    }
}
