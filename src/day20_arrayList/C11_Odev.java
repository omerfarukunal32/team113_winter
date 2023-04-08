package day20_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_Odev {
    public static void main(String[] args) {
        // Odev : verilen bir listede, istenen 2 index'deki
        //        elementlerin yerini degistirip yeni Listeyi bize döndüren bir method olusturun
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(10);

        System.out.println(sayilar); // [3, 5, 1, 4, 3, 7, 10]

        System.out.println(listteIndexDegistirme(sayilar,2,3)); // [3, 5, 4, 1, 3, 7, 10]

    }
    public static List<Integer> listteIndexDegistirme(List<Integer> Liste,int a,int b){
        int temp= Liste.get(a);
        Liste.set(a,Liste.get(b));
        Liste.set(b,temp);

        return Liste;

    }

}
