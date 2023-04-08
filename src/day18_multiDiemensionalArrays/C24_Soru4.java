package day18_multiDiemensionalArrays;

public class C24_Soru4 {
    public static void main(String[] args) {
        // Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        //         method olusturun.
        int[][] arr = {{3,2,}, {2,3},{3}};
        System.out.println(arrayElementleriCarpimi(arr));
    }
    public static int arrayElementleriCarpimi(int[][] arr){
        int caprim=1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                caprim*=arr[i][j];
            }
        }
        return caprim;
    }
}
