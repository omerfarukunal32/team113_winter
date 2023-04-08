package day25_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar);

        elementleriArtir(sayilar); // [6, 8, 10]
        // elementleri artir method'unu calistirdiktan sonra
        System.out.println("Element artir methodundan sonra "+sayilar); // [6, 8, 10]

        yeniListeAta(sayilar); // [1, 2, 3]
        System.out.println("Yeni Liste ata method'undan sonra "+sayilar); // [6, 8, 10]


    }
    public static void elementleriArtir(List<Integer> sayilar){
        // tum elementleri 2 katina cikaralim

        for (int i = 0; i <sayilar.size() ; i++) {
            sayilar.set(i,2*sayilar.get(i));
        }
        System.out.println("Elementleri artir method'unda : "+sayilar);
    }

    public static void yeniListeAta(List<Integer> sayilar){

        // sayilar Listesine yeni bir List degeri atayip
        // sonra 1,2,3 elementlerini ekleyin

        sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);

        System.out.println("Yeni Liste ata method'unda : "+sayilar);
    }

}
