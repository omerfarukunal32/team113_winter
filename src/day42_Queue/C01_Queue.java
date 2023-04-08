package day42_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {

        Queue<String> harfler=new LinkedList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("D");
        harfler.add("A");

        System.out.println(harfler); // [A, B, C, D, A]

        // 2. index'e D ekleyelim
        // Queue ozelliginden dolayi  her zaman sona ekler

        System.out.println(harfler.remove()); // A     ilk elementi siler
        System.out.println(harfler); // [B, C, D, A]

        harfler.remove();
        System.out.println(harfler); // [C, D, A]
        // Queue' da araya element ekleyemiyoruz

        harfler.add("K");
        harfler.add("L");

        System.out.println(harfler.element()); // C
        System.out.println(harfler); // [C, D, A, K, L]

        System.out.println(harfler.peek()); // C
        System.out.println(harfler); // [C, D, A, K, L]

        System.out.println("=======================");
        Queue<String> karakterler = new LinkedList<>();

        System.out.println(karakterler.peek()); // null
        // System.out.println(karakterler.element());   // NoSuchElementException

        System.out.println("===================");

        System.out.println(harfler.poll()); // C
        System.out.println(harfler);  // [D, A, K, L]

        System.out.println(karakterler.poll()); // null

        System.out.println(karakterler.offer("*")); // true
        System.out.println(karakterler); // [*]


    }
}
