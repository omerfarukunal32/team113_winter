package day05_incrementDecrement_Concatenation;

public class C02_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        /*
        Eger sayinin degeri sadece 1 artacak veya azalacaksa

        artirip sonra yazdirma/atama
        yazdirip sonra artirma/atama

        islemlerini tek satirda yapabiliriz
         */



        // a'nin degerini 1 artirin ve yeni degerini olusturacaginiz b variable'ina atayin

        int a= 20;


        a++;
        int b=a;

        System.out.println("a:"+a +", b: "+b); // a:21, b: 21


        // a'nin degerini b'ye atayin, sonra a'nin degerini 1 arttirin

        a =20;
        b=a++;  // once atama yapar, sonra artirir


        // a'nin degerini yazdirin ve sonra a'yi 1 artirin

        a=20;
        System.out.println("a :"+a); // a :20
        a++;

        System.out.println("===========");

        a=20;
        System.out.println("a : "+ a++); //a=20
        System.out.println("Birsonraki satirda a :" +a); // a=21


        System.out.println("==============");

        // a'nin degerini 1 azaltin ve sonra a'nin degerini yazdirin
        a=20;

        System.out.println(--a); // 19
        System.out.println("Birsonraki satirda a :" +a); //19


    }
}
