package day41_Collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
            Collections objeleri bir arada tutan yapilardir.
            Günlük hayatta karsilasilan durumlarla ilgili olusan ihtiyaclara gore
            farkli Colections yapilari vardir
            Bir uygalamada hangi collection'i kullanacagimiza biz ozelligine gore karar veririz.

            3 ana collection'dan bahsedebiliriz
                1. List
                2. Queue
                3. Set
            3 Interface ile kurallari belirleniyor

            Interface'lerden obje olusturamadigimiz icin childclass'lardan constructor'larini kullaniyoruz
            Özellikleri constructor'lar degil, DATA Türü olarak sectigimiz collection belirler.

            Linkedlist deyince aklimiza halay gelecek
         */
        LinkedList<String> linked1 = new LinkedList<>();
        List<String> linked2 = new LinkedList<>();
        Queue<String> linked3 = new LinkedList<>();
        Deque<String> linked4 = new LinkedList<>();

    }
}
