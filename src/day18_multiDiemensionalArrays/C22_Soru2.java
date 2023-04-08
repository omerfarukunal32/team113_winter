package day18_multiDiemensionalArrays;

import java.util.Arrays;

public class C22_Soru2 {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
                olusturacagimiz tek katli bir array’e bu toplamlari atayin.
                input : int[][] arr = {{3,4,5}, {2,3,6,7}};
                output: [5, 7, 11]
         */
        int[][] arr = {{3,4,5}, {2,3,6,7},{2,1}};
        int uzunluk=arr[0].length;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length<uzunluk){
                uzunluk=arr[i].length;
            }
        }
        int[] yeniArr = new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                yeniArr[i]+=arr[j][i];
            }
        }

        //for (int i = 0; i <uzunluk ; i++) {
        //    yeniArr[i]=arr[0][i]+arr[1][i];
        //}

        System.out.println(Arrays.toString(yeniArr));
    }

}
