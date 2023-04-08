package day42_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {

        // Deque Double ended queue
        // cift tarafli kuyruk

        Deque<String> harfler = new LinkedList<>();
        harfler.add("J");
        harfler.add("K");
        System.out.println(harfler); // [J, K]

        harfler.addFirst("B");
        System.out.println(harfler); // [B, J, K]

        harfler.remove();
        System.out.println(harfler); // [J, K]

        harfler.addFirst("T");
        harfler.addLast("T");
        System.out.println(harfler); // [T, J, K, T]
        harfler.add("L");
        System.out.println(harfler); // [T, J, K, T, L]

        System.out.println(harfler.removeFirstOccurrence("T")); // true
        System.out.println(harfler); // [J, K, T, L]

        System.out.println(harfler.removeLastOccurrence("R")); // false

        System.out.println(harfler.peekFirst()); // J
        System.out.println(harfler.peekLast());  // L    bu method silme islemi yapmaz
        System.out.println(harfler); // [J, K, T, L]
        System.out.println(harfler.hashCode());  // 3202810

        LinkedList<String> karakterler = new LinkedList<>();
        karakterler.add("*");
        karakterler.add("?");
        System.out.println(karakterler); // [*, ?]
        karakterler.push("&");
        System.out.println(karakterler); // [&, *, ?]

        LinkedList<String> copy = (LinkedList<String>) karakterler.clone();  // copy nin obje olarak atanmasi icin cast yaptik
        System.out.println(copy); // [&, *, ?]

        copy.pop();  // ilk elementi siler
        System.out.println(copy); // [*, ?]

    }
}
