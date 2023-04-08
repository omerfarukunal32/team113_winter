package day31_Inheritance;

public class DCorolla extends CToyota {

    String str3 = "Corolla";


    DCorolla(){
        // super() , extends den dolayi
        System.out.println("Parametresiz Corolla constructor'i calisti");
    }
    DCorolla(int sayi){
        this();
        System.out.println("int parametreli Corolla constructor'i calisti");
    }

    public static void main(String[] args) {

        DCorolla obj1 = new DCorolla(5);
    }
}
/*
    Biz gorunur bir constructor olusturdugumuzda
    Java'nin default constructor'u silmesine benzer olarak

    Extends keyword kullanilmis bir class'daki
    herhangi bir constructor'in ilk satirinda
    gozle gorunur bir constructor call yazilmissa
    Java default olarak koydugu super()' u siler

    Bir constructor'i icinde sadece bir tane constructor cal olabilir
    o da ilk satirda olmak zorundadir

    Eger this(parametreler) veya super(parametreler) ile
    constructor call yaptiginizda
    yazdigimiz argument ile uyumlu parametreye sahip
    bir constructor yoksa Java CTE verir
 */
