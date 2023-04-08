package day18_multiDiemensionalArrays;

import java.util.Arrays;

public class C20_Ubung {
    public static void main(String[] args) {
        String[][] siniflar = {{"A","B","C"},{"D","E"},{"F"}};
        int[][] arr = {{13,25,37},{41,12,23,34},{11,25},{17}};

        int top = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]>=20 && arr[i][j]<=40){
                    System.out.print(arr[i][j]+"+");
                    top+=arr[i][j];
                }
            }

        }
        System.out.print(" = "+top);


    }
}
