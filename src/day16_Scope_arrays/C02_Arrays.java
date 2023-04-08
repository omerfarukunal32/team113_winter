package day16_Scope_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String[] isimler={"Nurefsan","Berke","Mustafa"};
        int[] sayilar ={3,4,5,6,7,8,9,10}; // int'lardan olusan bir array, adi sayilar
        char[] karakterler={'e','4',','};

        // Array non-primitive data türlerindendir
        // Eger array'i liste seklinde olusturmayip new keyword kullaniyorsak
        // UZUNLUGUNU yazmak ZORUNDAYIZ
        String[] arr = new String[5];

        // Bir array tanimlanan uzunluktan daha fazla veya az eleman alamaz

        // Bir array i yazdirmak istersek
        // array'ler direk yazdirilamaz
        System.out.println(isimler); // [Ljava.lang.String;@4c203ea1
        System.out.println(Arrays.toString(sayilar));  // [3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println(Arrays.toString(arr)); //[null, null, null, null, null]

        int[] a= new int[7];
        System.out.println(Arrays.toString(a));  // [0, 0, 0, 0, 0, 0, 0]  int' default degeri 0'dir

        // array'deki elementlere nasil ulasiriz? index ile

        a[0] = 4;  // [4, 0, 0, 0, 0, 0, 0]
        a[3] =7;   // [4, 0, 0, 7, 0, 0, 0]
        // a[10] = 8;  // .ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(a));

        // sayilar array'inin 4.index'indeki elementi yazdirin

        System.out.println(sayilar[4]);  // 7

        // isimler arrayìnin 1.index'indeki ismi yazdirin

        System.out.println(isimler[1]); // Berke

    }
}
