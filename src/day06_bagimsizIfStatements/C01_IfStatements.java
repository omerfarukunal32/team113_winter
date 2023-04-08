package day06_bagimsizIfStatements;

public class C01_IfStatements {
    public static void main(String[] args) {
        /*
        Buradaki sartlar birbirinden bagimsizdir
        uygun sayilaar olursa 3 if body'si de calisabilir
        bazen de hicbir if body'si devreye girmeyebilir

        Process finished with exit code 0
        yazarsa kodun hicbir sorun olmadan calitigini anliyoruz
         */

        int a=13;
        int b=50;

        if(a>b){
            System.out.println("a b'den büyük");
        }
        if(a%2==0){
            System.out.println("a cift sayidir");
        }
        if(b>100){
            System.out.println("b 100'den büyüktür");
        }

        boolean sonuc = a*7>b;
        /*
        bazen if statement'da direk boolean bir deger sart olarak yazilabilir
        bu durumda boolean degeri true ise if body calisir
         */

        if (sonuc){
            System.out.println("Istenen sart saglandi");
        }
    }
}
