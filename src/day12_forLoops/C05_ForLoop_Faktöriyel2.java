package day12_forLoops;

public class C05_ForLoop_Faktöriyel2 {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        int sayi=8;
        int faktoriyel=1;


        System.out.print(sayi+"! = ");
        for (int i=sayi;i>=1;i--){
            faktoriyel*=i;

            if(i!=1){
                System.out.print(i+"*");
            }else {
                System.out.print(i+" ");
            }
        }

        System.out.print("= "+faktoriyel);

    }
}
