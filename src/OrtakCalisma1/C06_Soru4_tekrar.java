package OrtakCalisma1;

public class C06_Soru4_tekrar {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.
        int[]arr = {1,2,3,4,5,6,7,8,9,9};
        elemanVarmi(arr,9);
    }
    public static void elemanVarmi(int[] arr, int arananElement){

        int sayiAdedi=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == arananElement ){
                sayiAdedi++;
            }
        }
        if (sayiAdedi ==0){
            System.out.println("Element yoltur");
        }else {
            System.out.println("Eleman "+sayiAdedi+" adet vardir");
        }

    }

}
