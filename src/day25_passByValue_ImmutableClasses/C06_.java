package day25_passByValue_ImmutableClasses;

public class C06_ {
    public static void main(String[] args) {

        String a = "";
        a += 2;
        a += 'c';
        a += false;

        //System.out.println(a); // 2cfalse

        // a=""+2+'c'+false;
        if (a == "2cfalse") {
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }
    }
}
