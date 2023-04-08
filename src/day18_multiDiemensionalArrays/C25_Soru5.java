package day18_multiDiemensionalArrays;

public class C25_Soru5 {
    public static void main(String[] args) {
        // Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
        //         toplaminini yazdiran bir method olusturun.
        int[][] arr = {{3,2,}, {2,3},{3},{2,5,7,6,9}};
        innerArraySonElementToplami(arr);

    }
    public static void innerArraySonElementToplami(int[][] arr){
        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = arr[i].length-1; j <arr[i].length ; j++) {
                toplam+=arr[i][j];
            }
        }
        System.out.println(toplam);
    }
}
