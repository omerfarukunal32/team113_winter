package day17_Arrays_Soru;

import java.util.Arrays;

public class C20_Ubung_Soru2 {
    public static void main(String[] args) {
        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //        method yaziniz

        int[] arr={-3,-2,-1,0,1,2,3};
        System.out.println(Arrays.toString(arr)); // [-3, -2, -1, 0, 1, 2, 3]
        int toplam=pozitifSayiTopla(arr);
        System.out.println(toplam); // 6

    }
    public static int pozitifSayiTopla(int[] arr){

        int toplam =0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                toplam+=arr[i];
            }

        }
        return  toplam;
    }

}
