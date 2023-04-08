package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C21_Soru5 {
    public static void main(String[] args) {
        // Soru 5- Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
        //         ayri bir liste olarak veren bir program yazin.
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {4,5,6,21,45,5,78,963};
        System.out.println(findeGleichElement(arr1, arr2));
    }

    private static List<Integer> findeGleichElement(int[] arr1, int[] arr2) {
        List<Integer> gleichElement = new ArrayList<>();
        for (int each:arr1
             ) {
            for (int each2:arr2
                 ) {
                if (each==each2 && !gleichElement.contains(each)){
                    gleichElement.add(each);
                }
            }
        }
        return gleichElement;
    }
}
