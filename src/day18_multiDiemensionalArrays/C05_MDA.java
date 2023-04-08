package day18_multiDiemensionalArrays;

public class C05_MDA {
    public static void main(String[] args) {
        int[][] arr = {{3,5,7},{1,2,3,4},{1,2},{7}};

        //  toplam element sayisi kactir?
        int elementSayisi=0;
        for (int i = 0; i <arr.length ; i++) {
            elementSayisi+=arr[i].length;
        }
        System.out.println("toplam elemet sayisi : "+elementSayisi);  // 10

        // tüm elementlerin toplamini bulun?
        // MDA'lerde her bir elementi elden gecirmek istiyorsak
        // kat sayisi kadar for-loop kulaniriz

        int tumElementToplami=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                tumElementToplami+= arr[i][j];
            }
        }
        System.out.println("Tüm elementlerin toplami"+tumElementToplami);  // 35

    }
}
