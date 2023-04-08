package day20_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C21_Soru1 {
    public static void main(String[] args) {
        // Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //         elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.

        int[] arr = {1,2,1,2,3,4,3,4,5,6,5,6,7,8,7,8,9,7,8,9,7,8,9};

        System.out.println(Arrays.toString(arr));
        arr=tekrardanKurtul(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static int[] tekrardanKurtul(int[] arr){
        List<Integer> newList = new ArrayList<>();


        for (int i = 0; i <arr.length ; i++) {
            if (!newList.contains(arr[i])){
                newList.add(arr[i]);
            }
        }
        arr=new int[newList.size()];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=newList.get(i);
        }
        return arr;


    }

}
