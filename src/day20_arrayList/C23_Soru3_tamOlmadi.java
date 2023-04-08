package day20_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C23_Soru3_tamOlmadi {
    public static void main(String[] args) {
        //Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        //        kismini list olarak bize donduren bir method olusturun
        List<String> namen = new ArrayList<>();
        namen.add("Ali");
        namen.add("Halil");
        namen.add("Mustafa");
        namen.add("Veli");

        System.out.println(namen);
        System.out.println(elementSilme(namen, "a"));

    }
    public static List<String> elementSilme(List<String> list,String ch){
        List<String> newList = new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {
            if (!(list.get(i).contains(ch))){
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
