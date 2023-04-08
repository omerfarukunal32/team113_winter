package day42_Queue;

import java.util.Set;
import java.util.TreeSet;

public class C03_Set {
    public static void main(String[] args) {

        Set<String> ogrenciler = new TreeSet<>(); // treeSet  dogal siralama yapar, hachSet hizli calisir
        // Set uniqe bakiyor, index yapisini desteklemiyor,

        ogrenciler.add("Emre");
        ogrenciler.add("Kerem");
        ogrenciler.add("Duygu");
        ogrenciler.add("Burcu");
        System.out.println(ogrenciler);  // [Burcu, Duygu, Emre, Kerem]   Natural order- dogal siralama

        ogrenciler.add("Ahmet");
        System.out.println(ogrenciler);  // [Ahmet, Burcu, Duygu, Emre, Kerem]
        ogrenciler.add("Kerem");
        System.out.println(ogrenciler);  // [Ahmet, Burcu, Duygu, Emre, Kerem] // eski kerem'i silip, yeni kerem'i ekler (Uniqe)



    }
}
