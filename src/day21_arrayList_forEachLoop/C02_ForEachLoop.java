package day21_arrayList_forEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        /*
            Bizden istenen görevde siralama önemsiz ise
            asil amaclanan tüm elementleri elden gecirmek ise,
            forLoop yerine ForEachLoop tercih edilir

            forEachLoop da
                - index yok
                - baslangic degeri yok
                - bitis degeri yok
                
         */
        int[] arr = {3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        //  arr'nin tüm elemanlarinin toplamini yazdirin

        int toplam=0;
        for (int each: arr
             ) {toplam += each;
        }
        System.out.println("Elementler Toplami : "+toplam); // 72

        // arr'in elementlerinden 3 ile bölünebilenleri yazdirin


        for (int each: arr
             ) {
            if (each%3==0){
                System.out.print(each+" "); // 3 6 3 3 3
            }
        }
        System.out.println("");

        // arr'in elementleri icinde kac tane tek sayi oldugunu bulun

        int sayac=0;
        for (int each: arr
             ) {
            if (each%2!=0){
                sayac++;
            }
        }
        System.out.println("Array'deki tek sayi adedi : "+sayac); // 10


    }
}
