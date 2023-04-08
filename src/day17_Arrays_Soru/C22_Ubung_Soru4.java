package day17_Arrays_Soru;

public class C22_Ubung_Soru4 {
    public static void main(String[] args) {
        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //         kullanildigini yazdiran bir method olusturun

        int[] arr = {1,2,3,4,1,2,1};
        elmentVarmi(arr,1);
        elmentVarmi(arr,0);
        elmentVarmi(arr,3);

    }
    public static void elmentVarmi(int[] arr, int element){

        int sayac=0;
        for (int i = 0; i <= arr.length-1 ; i++) {
            if (arr[i]==element){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println(element+" array'de bulunmuyor");
        }else {
            System.out.println(element+" array'de "+sayac+" adet bulunmakratir");
        }
    }
}
