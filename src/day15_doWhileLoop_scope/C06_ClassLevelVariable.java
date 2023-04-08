package day15_doWhileLoop_scope;

public class C06_ClassLevelVariable {

    /*
        Bir class icinde tüm method'larin erisebilecegi variable'lar istenirse
        Class Level'da (Class'in icinde ama method'larin disinda) olusturulmalidir

        1- Class Level'da olusturulan variable'larin scope'u tüm class'dir
        2- Class Level'da olusturulan variable'lara deger atanmasa bile
            Java onlar icin tanimlanmis DEFAULT DEGERLER atar
        3- Class Level'da olusturulan variable'lar static veya instance(static olmayan) olabilir
        4- Static olarak tamimlanan variable'lar tüm method'larda direk kullanilabilir
        5- method static ise, icerisine static olmayan hicbirsey almaz
     */

    static int sayi=10;
    static String isim;
    static boolean bl;
    static char chr;
    static int in1;
    int in2;
    boolean bl2;

    public static void main(String[] args) {
        System.out.println(sayi);
        System.out.println("String: "+isim);  // null
        System.out.println("Boolean: "+bl);  // false
        System.out.println("Char: "+chr);     // "" hiclik
        System.out.println("int: "+in1);     // sayisal türler icin 0
        staticMethod();
        //staticOlmayanMethod();

    }

    public static void staticMethod() {  // method static oldugu icin icine static olmayani kabul etmez
        sayi++;
        System.out.println(sayi);
        System.out.println(sayi);
        System.out.println(chr);
        //System.out.println(in2);  // instance
        //System.out.println(bl2);  // instance
    }

    public void staticOlmayanMethod(){
        sayi--;
        System.out.println(sayi); //s
        System.out.println(bl);  //s
        System.out.println(in2); // instance
        System.out.println(bl2); // instance(üstün irk yok :) )

    }
}
