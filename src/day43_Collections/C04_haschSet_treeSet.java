package day43_Collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_haschSet_treeSet {
    public static void main(String[] args) {
        /*
            Bir hashSet ve bir treeSet olusturalim
            bir loop ile iclerine 150000 eleman ekleyelim
            islem surelerini kiyaslayalim
         */

        Random rnd = new Random();
        Set<Integer> hascSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        int sayi;

        Long hashStart = System.currentTimeMillis();
        for (int i = 0; i <150000 ; i++) {
            sayi=rnd.nextInt(1250000);
            hascSet.add(sayi);
        }
        Long hashFinis = System.currentTimeMillis();
        Long treeStart = System.currentTimeMillis();
        for (int i = 0; i <150000 ; i++) {
            sayi= rnd.nextInt(1250000);
            treeSet.add(sayi);
        }
        Long treeFinis = System.currentTimeMillis();

        System.out.println("Hash Islem Suresi: "+(hashFinis-hashStart)); // 68
        System.out.println("Tree Islem Suresi: "+(treeFinis-treeStart)); // 303

    }
}
