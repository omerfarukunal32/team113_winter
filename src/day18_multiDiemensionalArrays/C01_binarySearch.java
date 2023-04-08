package day18_multiDiemensionalArrays;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {
        // Verilen bir array'de istenen elementin olup olmadigini bulur

        int[] arr = {4,9,1,5,11,3,7,4,6};
        System.out.println(Arrays.binarySearch(arr,5)); // -2
        System.out.println(Arrays.binarySearch(arr,11)); // 4
        System.out.println(Arrays.binarySearch(arr,1));  // -1
        System.out.println(Arrays.binarySearch(arr,7));  // -2
        // Array'de binarySearch() methodununun düzgün calismasi icin öncelikle srt() calistirilmalidir

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 3, 4, 4, 5, 6, 7, 9, 11]

        System.out.println(Arrays.binarySearch(arr,5)); // 4
        System.out.println(Arrays.binarySearch(arr,11)); // 8
        System.out.println(Arrays.binarySearch(arr,1));  // 0
        System.out.println(Arrays.binarySearch(arr,7));  // 6
        System.out.println(Arrays.binarySearch(arr,4));  // 2

        // binarySearch method'u aranan elementin indexìni döner

        System.out.println(Arrays.binarySearch(arr,2)); //-2
        System.out.println(Arrays.binarySearch(arr,-3)); //-1
        System.out.println(Arrays.binarySearch(arr,8));  //-8
        System.out.println(Arrays.binarySearch(arr,10));  //-9
        System.out.println(Arrays.binarySearch(arr,13));  //-10

        // olmayan bir element aratilirsa, önce array'de olsaydi nerede olurdu bunu buluyoruz
        // sonra olmasi gereken siranin - isaretli degerini veriyoruz
        // bu mantikla en kücük elementten daha kücük bütün sayilar icin -1
        // en büyük elementten büyük olan bütün sayilar icin de  -length-1   degeri döndürür

    }
}
