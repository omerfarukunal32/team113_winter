package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayiArrayListeCevirme {
    public static void main(String[] args) {
        Integer[] arr = {3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};
        // arr array'inin elementlerini iceren bir arrayList olusturun

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println("Sayilar Listesi : "+sayilar);  // 3, 5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8]

        /*
        Java'da bir aaray'i arrayList'e cevirmek icin asList() methodu vardir
        Ancak kullanimi tavsiye edilmey. Cünkü iki büyük dezavantaji vardir
                1- asList() kullanilarak array'den List'e ceviren Listelerde
                    ekleme/silme gibi uzunlugu degisen method'lar kullanilamaz
                2-  Arka planda array ve array'den dönüstürdügümüz List beraber hareket eder
                    Birinde yaptigimiz update'ler ötekine de islenir
        */

        List<Integer> arraydenList = Arrays.asList(arr);

        System.out.println("Array'den Liste ceviren : "+arraydenList);  //[3, 5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8]

        // 1.Dezavantaj

        // Iki List'e 11 ekleyelim

        sayilar.add(11);
         System.out.println("Sayilar Listesi : "+sayilar);

        // arraydenList.add(11);
        System.out.println("Array'den Liste ceviren : "+arraydenList);

        // Iki List'in 0. index'indeki elementleri silelim

        sayilar.remove(0);
        System.out.println(sayilar);
        //arraydenList.remove(0);

        // 2. dezavantaj

        System.out.println("Array :        "+Arrays.toString(arr));
        System.out.println("Array'den List "+arraydenList);

        // array'in bir elementine yeni bir deger atayalim

        arr[0]=22;

        System.out.println("=========== array'i degistirdikten sonra =============");

        System.out.println("Array :       "+Arrays.toString(arr));
        System.out.println("Array'den List"+arraydenList);


        // List'in bir elementini apdate edelim

        arraydenList.set(1,45);

        System.out.println("=========== List'i degistirdikten sonra =============");

        System.out.println("Array :       "+Arrays.toString(arr));
        System.out.println("Array'den List"+arraydenList);






    }
}
