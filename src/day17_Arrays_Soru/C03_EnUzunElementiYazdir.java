package day17_Arrays_Soru;

public class C03_EnUzunElementiYazdir {
    public static void main(String[] args) {
        // Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] arr1= {"Melike","Burkay","Inci","Eda","Emre"};
        enUzunEnKisaYazdir(arr1);  // Burkay , Eda

        String[] arr2= {"Melike","Burkay","Inci","Eda","Emre","Su","Hüseyin"}; // Hüseyin , Su
        enUzunEnKisaYazdir(arr2);

    }
    public static void enUzunEnKisaYazdir(String[] arr){
        String enUzunKelime=arr[0]; // uzunluk 0
        String enKisaKelime=arr[0]; // uzunluk 0

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length()>=enUzunKelime.length()){
                enUzunKelime=arr[i];
            }
            if (arr[i].length()<enKisaKelime.length()){
                enKisaKelime=arr[i];
            }
        }
        System.out.println("Array'deki en uzun kelime : "+enUzunKelime);
        System.out.println("Array'deki en kisa kelime : "+enKisaKelime);

    }
}
