package day02_dataTurleri_Scanner;

public class C02_dataTurleri {
    public static void main(String[] args) {
        char ilkHarf= '8';

        byte ogrYasi1=11;
        short ogrYasi2=15;
        int ogrYasi=16;
        long ogrYasi4=15;

        double sayi1=3.236547895214522414455;
        System.out.println(sayi1); // 3.2365478952145224

        // double virgülden sonra 16 hane yazdirir, ama cok kücük sayilara indigi icin
        // ondalikli kismin sonunda hatalar olabilir.
        // 15 7 3 = 4.99999999999999  ,  5.0  5.0000000000001

        float sayi2= 5.22212151545454F;


        // float sayi tanimladigimizda double'dan farkli oldugunu belirtmek icin
        // sonuna f veya F yazmak zorundayiz
        System.out.println(sayi2);


        // Biz dersler boyunca hafiza önemli olmadigi icin
        // tamsayilar icin int, ondalikli sayilar icin double kullaniriz
    }
}
