package day18_multiDiemensionalArrays;

public class C21_Soru1 {
    public static void main(String[] args) {
        // Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
        //         method olusturun.
        int[][] arr = {{13,25,37},{41,12,23,34},{11,25},{17}};
        arrayCiftSayiToplama(arr);
    }
    public static void arrayCiftSayiToplama(int[][] arr){
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]%2==0){
                    toplam+=arr[i][j];
                }
            }
        }
        System.out.println("Cift sayilar toplami : "+toplam);

    }

}
