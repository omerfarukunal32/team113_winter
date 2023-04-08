package OrtakCalisma1;

import java.util.Arrays;

public class C08_Soru7 {
    public static void main(String[] args) {
        // Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //eski array’e yeni degeri atayin.
        int[] arr = {1,2,3,4,5};
        arr=elemanEkleme(arr,6);

    }
    public static int[] elemanEkleme(int[] arr, int girilenSayi){
        int[] yeniArr = new int[arr.length+1]; // [0,0,0,0,0]

        for (int i = 0; i <arr.length ; i++) {
            yeniArr[i] = arr[i];
        }// [1,2,3,4,0]
        yeniArr[yeniArr.length-1]=girilenSayi;
        System.out.println(Arrays.toString(yeniArr));
        return yeniArr;

    }
}
