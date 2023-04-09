package day28_deneme_bastan_Yap;

import day28accessModifier_encapsulation.C01;

public class deneme {

    public static void main(String[] args) {

        C01 obj = new C01();

        // obj.str = "Fava";    farkli package default acces modifier
        // C01.s="Fava";        farkli package default acces modifier
        // obj.b=10;            private access modifier

        // C01.c=30;            private access modifier

        obj.d=50; // d static olmadigi icin, obje uzerinde atama yaptik
        C01.a=30;

    }
}
