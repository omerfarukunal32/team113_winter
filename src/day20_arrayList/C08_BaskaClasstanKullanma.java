package day20_arrayList;

public class C08_BaskaClasstanKullanma {
    public static void main(String[] args) {
        // Verilen sayinin pozitif tam bölenleri sayisi 10'dan cok ise "Guzel", yoksa "Kotu" yazdirin
        int sayi=100;
        int pozitifTamBolenlerSayisi= C07_TamBolenlerListesi.pozitifBoleleriListele(sayi).size();

        if (pozitifTamBolenlerSayisi>10){
            System.out.println("Guzel");
        }else {
            System.out.println("Kotu");
        }

    }
}
