package day15_doWhileLoop_scope;

public class C24_Soru1_doWhile {
    public static void main(String[] args) {
        // Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.

        char harf='k';
        String yeniHarf="";
        do {
            yeniHarf+=harf;
            harf++;
        }while (harf<='t');

        System.out.println(yeniHarf);

    }
}
