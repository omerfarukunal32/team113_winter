package day05_incrementDecrement_Concatenation;

public class C_Ek {
    public static void main(String[] args) {

        int a= 10;


        System.out.println("a'nin degeri :" + ++a); // 11  (önce artir sonra yazdir)

        int b= a++;  // a'nin degerini önce b'ye atama yap, sonra a'yi 1 artir

        System.out.println("b'nin degeri :" +b); // 11

        int c= b++ +a;  // önce b+a yi c'ye ata, sonra b' nin degerini 1 artir

        System.out.println("c' nin degeri :" +c); //23

        System.out.println("So toplam :" +(a+b+c)); //47
    }
}
