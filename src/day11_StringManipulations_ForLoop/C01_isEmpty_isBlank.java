package day11_StringManipulations_ForLoop;

public class C01_isEmpty_isBlank {
    public static void main(String[] args) {
        String str="Java candir";

        System.out.println(str.isEmpty()); // false

        System.out.println(str.isBlank());  // false

        System.out.println("==============================");
        str="   ";

        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // true
        System.out.println(str.length()); //  3

        System.out.println("===================================");
        str="";

        System.out.println(str.isEmpty()); // true
        System.out.println(str.isBlank()); // true
        System.out.println(str.length());  // 0

    }
}
