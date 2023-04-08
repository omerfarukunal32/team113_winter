package day29_inheritance;

public class C04_Child extends C03_ParentClass  {

    int c=20;
    int a;
    String s ="Child class";
    String m;

    public void method1(){
        System.out.println("child class method1");
    }

    public static void main(String[] args) {

        C03_ParentClass objC03 = new C03_ParentClass();
        System.out.println(objC03.a);
        objC03.a=20;
        objC03.b=22;
        objC03.s="p";
        objC03.t="K";
        objC03.method1();
        objC03.method2();



        C04_Child objC04 = new C04_Child();

        objC04.a=50;
        objC04.c=20;
        objC04.s="u";
        objC04.m="l";
        objC04.method1();
        // extends yaptiktan sonra gelenler asagida
        // C04 class'ini C03'e child yapinca
        // child class'da olmayip parent class'da olan
        // b,t ve method2 ozellik olarak obj04'e eklendi

        objC04.b=8;
        objC04.t="y";
        objC04.method2();

        /*
            Java'da parent class'lar child edinmez
            child class'lar parent edinir

            Bir class'in baska bir class'daki TUM OZELLIKLERI
            otomatik olarak edinesini istiyorsak
            class'imizi extends keyword ile child yapariz
            (Size baba diyebilir miyim?// sizi parent yaptim)
         */

    }


}
