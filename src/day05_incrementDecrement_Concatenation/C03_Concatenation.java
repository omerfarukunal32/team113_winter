package day05_incrementDecrement_Concatenation;

public class C03_Concatenation {
    public static void main(String[] args) {
        // Bir String baska bir String veya baska data türünden bir variable ile
        // + isareti ile brlestirilebilir

        String a="Java";
        String b="Güzeldir";

        System.out.println(a+b); // JavaGüzeldir

        System.out.println(a+" "+b); // Java Güzeldir

        int c=10;
        int d=20;

        System.out.println(a+c+d); // Java1020

        // Eger String ile baska data türündeki bir deger toplanirsa Java sonucu String yapar.

        // Peki Java30 yazmak istersek

        System.out.println(a+(c+d));  // Java30

        System.out.println(a+c*d); // Java200 (öncelik carpma oldugu icin parantez gerekmez)

        System.out.println(d+c+a); // 30Java  (islem önceligi soldaki oldugu icin once d+c 'yi yapar)



    }
}
