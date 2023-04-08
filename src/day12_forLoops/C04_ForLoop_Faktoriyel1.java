package day12_forLoops;

public class C04_ForLoop_Faktoriyel1 {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.

        int sayi=4;
        int faktoriyel=1;
        for (int i=sayi;i>1;i--){
            faktoriyel*=i;
        }
        System.out.println(sayi+"! ="+faktoriyel);
    }
}
