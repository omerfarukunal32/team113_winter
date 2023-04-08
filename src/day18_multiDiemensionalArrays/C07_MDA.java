package day18_multiDiemensionalArrays;

public class C07_MDA {
    public static void main(String[] args) {
        int[][] arr = {{13,25,37},{41,12,23,34},{11,25},{17}};

        // 20 ile 40 arasinda olan sayilarin (20 ve 40 dahil) toplamini bulun

        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]>=20 && arr[i][j]<=40 ){
                    toplam+=arr[i][j];
                    System.out.print(arr[i][j]+"+");
                }
            }
        }
        System.out.print("="+toplam);

    }
}