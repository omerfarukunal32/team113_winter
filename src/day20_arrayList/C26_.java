package day20_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C26_ {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Yahya");
        liste.add("Meryem");
        System.out.println(liste);
        Collections.sort(liste);
        System.out.println(liste);

    }
}
