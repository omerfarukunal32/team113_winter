package day14_methodOverloading_whileLoop;

public class C03_methodOverLoading {
    public static void main(String[] args) {
        /*
        Bir class'da ayni isme sahip farkli islem yapan methodlar olabilir
        Java bu method'lardan hangisinin calisacagina parametrelere göre karar verir

        Bu isleme bir class'da ismi ayni, parametreleri farkli method'lar olmasina
        Method OVERLOADING denir. B
         */
        String str="Bu is olacak";
        System.out.println(str.replace("Bu is", "Java guzel")); //Java guzel olacak
        System.out.println(str.replace('u', 'e'));  // Be is olacak
    }
}
