package OrtakCalisma1;

public class C04_Soru4 {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.

        int[] arr={1,2,3,4,5,5,5,6,7,7};
        yazdir(arr,7); // 2
        yazdir(arr,8); // 0
                              // Eleman yok

    }
    public static void yazdir(int[] arr,int istenen){
        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==istenen){
                sayac++;
            }
        }
        System.out.println(sayac);
        if (sayac==0){
            System.out.println("Eleman yok");
        }

    }
}
