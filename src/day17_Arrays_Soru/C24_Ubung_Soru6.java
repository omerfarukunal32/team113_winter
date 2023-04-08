package day17_Arrays_Soru;

public class C24_Ubung_Soru6 {
    public static void main(String[] args) {
        // Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.
        String[] arr2= {"Melike","Burkay","Inci","Eda","Emre","Su","Hüseyin","Ömer Faruk"};
        enUzunEnKisa(arr2);

    }
    public static void enUzunEnKisa(String[] arr){
        String enUzun=arr[0];
        String enKisa=arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (enUzun.length()<arr[i].length()){
                enUzun=arr[i];
            }
            if (enKisa.length()> arr[i].length()){
                enKisa=arr[i];
            }
        }
        System.out.println("String'deki en uzun element : "+enUzun+"\nEn kisa element : "+enKisa);

    }


}
