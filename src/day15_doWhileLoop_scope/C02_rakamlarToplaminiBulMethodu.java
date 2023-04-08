package day15_doWhileLoop_scope;

public class C02_rakamlarToplaminiBulMethodu {
        // Verilen pozitif bir tamsayi nin rakamlar toplamini bize döndüren
        // method olusturun


    public static int rakamlarToplaminiBul(int verilensayi){

        int sayi=verilensayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        int basamakSayisi=(sayi+"").length();
        for (int i = 1; i <=basamakSayisi ; i++) {

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;
        }
        return rakamlarToplami;
    }

}
