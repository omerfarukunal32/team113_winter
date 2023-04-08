package day43_Collections;

import java.util.*;

public class C02_MixSet {
    public static void main(String[] args) {
        Set<Object> mixSet = new HashSet<>();

        mixSet.add(12);
        mixSet.add("Java");
        mixSet.add('S');
        mixSet.add(true);

        int[] arr = new int[3];
        arr[2] =34;
        arr[1]=71;


        List<Object> mixList = new ArrayList<>();
        mixList.add("Hava");
        mixList.add(24);

        mixSet.add(mixList);

        System.out.println(mixList); // [Hava, 24]
        System.out.println(mixSet);  // [Java, [Hava, 24], S, 12, true]

        // Collections objeleri birarada tutan yapilardir.

        System.out.println(mixSet.size()); // 6
        System.out.println(mixSet.contains(24)); // false
        System.out.println(mixSet.contains(12)); // true

        // Data turu olarak object secilirse icine her data turunden element kullanilabilir
        // Ancak elementlere ulasmamiz ya da update etmek gibi islemleri yapmamiz
        // mumkun olmayabilir ya da cok zor olabilir


    }
}
