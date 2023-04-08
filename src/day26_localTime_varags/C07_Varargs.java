package day26_localTime_varags;

public class C07_Varargs {
    public static void main(String[] args) {

        //Verilen iki sayiyi toplayip yazdiran bir method olusturun

        topla(3,6); // 9
        topla(3,4,5); // 12



    }
    public static void topla(int sayi1, int sayi2){
        System.out.println(sayi1+sayi2);
    }

    public static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println(sayi1 + sayi2 + sayi3);
    }
}
