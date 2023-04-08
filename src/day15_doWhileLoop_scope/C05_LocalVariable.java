package day15_doWhileLoop_scope;

public class C05_LocalVariable {
    public static void main(String[] args) {
         /*
            1-  Bir method icerisinde olusturulan variable'in scope'u o method'dur
                Baska bir method'da KULLANILAMAZ
                Bu variable'lara local variable denir
            2-  Her ne kadar bir method icinde olsalar da, Loop'larin da ayri bir scoope'u vardir
                Loop icerisinde olusturulan variable'lar Loop disinda KULLANILAMAZLAR
            3- Local variable'lari deger atamadan olusturabiliriz
                ancak deger atamadan kullanamayiz
         */

        String isim= "ali Can";
        int sayi;
        // System.out.println(sayi);

        //sayi++;

        for (int i = 0; i <10 ; i++) {
            int j=i+1;
        }
        //System.out.println(i);
    }

    public static void baskaMethd(){

        //System.out.println(isim);
        int sayi=5;


    }
}
