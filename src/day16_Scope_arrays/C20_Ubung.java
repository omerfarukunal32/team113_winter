package day16_Scope_arrays;

import java.util.Arrays;

public class C20_Ubung {
    public static void main(String[] args) {

        Integer[] arr = new Integer[3];

        arr[0] =1;
        arr[1] =2;
        arr[2] =3;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            arr[i]++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
