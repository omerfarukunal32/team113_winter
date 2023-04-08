package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C22_Soru3 {    // 1234567
    /*
        Soru 3-  Verilen String bir array’deki her bir elementi kontrol edip,
                    - Kelimenin uzunlugu cift sayi ise ilk yarisini
                    - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
                      yeni bir listeye ekleyip yazdirin.
     */
    public static void main(String[] args) {

        String[] arr = {"Lina","Ali","Lena","Thomas","Ahmet"};
        List<String> list=new ArrayList<>();
        for (String each:arr
             ) {
            if (each.length()%2==0){
                list.add(each.substring(0,each.length()/2));
            }else {
                list.add(each.substring((each.length()-1)/2,each.length()));
            }
        }
        System.out.println(list);

    }
}
