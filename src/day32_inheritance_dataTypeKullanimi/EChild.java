package day32_inheritance_dataTypeKullanimi;

public class EChild extends DParent {

    String str = "Child";

    void method1(){

        System.out.println("Child method 1");
    }


    // Override   : gecersiz kilmak
    // Overridden : gecersiz kilinan

    public static void main(String[] args) {

        EChild childC = new EChild();
        childC.method1(); // Child method 1
        System.out.println(childC.str); // Child

        System.out.println("==========================");

        DParent childP = new EChild();
        System.out.println(childP.str); // Parent
        childP.method1(); // Child method 1
    }
}
