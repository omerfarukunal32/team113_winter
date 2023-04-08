package day27_StringBuilder;

public class C20_Ubung {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("OCAJP8");

        sb1.subSequence(2, 4);
        System.out.println(sb1);

        sb1.deleteCharAt(3);

        sb1.reverse( );
        System.out.println(sb1);




    }
}
