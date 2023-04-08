package day14_methodOverloading_whileLoop;

public class C04_MethodOverLoading {
    public static void main(String[] args) {
        /*
        Java OverLoading Kurallari
            1- Isim ve parametreleri ayni olan birden fazla method olusturulamaz
            2- Data türleri farkli olan parametrelerin yerlerini degistirirsek Java yeni bir method olarak kabul eder
                (int,double)(double,int)

             Overloading olan class'larda Java hangi method'un calistirilacagina su sekilde karar verir

             1- Cagirilan isimde method var mi?
             2- Method call'da kullanilan arguments(parantez ici) ile method'lardaki parametrelerin %100 uyumlu oldugu var mi?
             3- Argument ile parametre ayni olmasa bile verilen argumentleri kabul edecek parametre var mi?
             4- Casting ile birden fazla method'u kullanabiliyorsa daha az Casting ile calisacak method'u kullanir
         */

        topla(3,5); // 8
        topla(3.4,2.3); // 5.7

        //topla("ali","");     CTE bu argumentleri kabul edebilecek parametre yok
        topla('a','b'); // iki int: 195
        topla(3f,4f); // iki double 7.0
        topla(3f,4); // daha az Casting yapacagi yeri secer, double ve int 7.0

    }


    public static void topla(int a, int b){
        System.out.println("Iki sayinin toplami: "+ (a+b));
    }

    public static void topla(double a, double b){
        System.out.println("Iki double sayinin toplami: "+(a+b));
    }

    public static void topla(int sayi1, double sayi2){  // signature: topla int double
        System.out.println("Int ve double sayilarin toplami: "+(sayi1+sayi2));
    }
    public static void topla(double sayi1, int sayi2){ // topla double int
        System.out.println("Double ve Int iki sayinin toplami: "+(sayi1+sayi2));
    }
}
