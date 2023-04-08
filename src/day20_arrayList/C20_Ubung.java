package day20_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C20_Ubung {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();

        isimler.add("Mustafa");
        isimler.add("Ali");
        isimler.add("Omer");
        isimler.add("Osman");
        isimler.add("Ebubekir");
        System.out.println(isimler);

        System.out.println(isimler.get(2));
        System.out.println(isimler.indexOf("Osman"));
        System.out.println(isimler.lastIndexOf("Ali"));
        isimler.add("Ali");
        System.out.println(isimler.lastIndexOf("Ali"));
    }
}
