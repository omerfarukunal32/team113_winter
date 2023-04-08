package day31_Inheritance;

import day30_inheritance.GParent;

public class AChild extends GParent  {
    String childStr;

    AChild(){

        System.out.println("AChild class constructor calisti");
    }

    public static void main(String[] args) {
        // System.out.println(childStr);  static degil
        // System.out.println(sayiParent); static degil
        // System.out.println(sayiGrandParent); static degil

        AChild objeChild = new AChild();
        // super constructor call, extends oldugundan
    }

    /*
        Java'da inheritance kullanilirken child class'indaki obje parent class'lardaki
        tum ozelliklere sahip olur
        bunu saglayan Java mekanizmasi super() constructor call'dur

        Extends keyword kullanilan bir class'da
        olusturulan her bir constructor'in ilk satirinda
        biz dormesek bile super() vardir
        super() ==> once parent classà gidip oradaki parametresiz constructor'i calistir demektir

        bu sekilde child class'daki constructor calistiginda
        extends keyword kullanmayan parent buluncaya kadar
        parent class`lara gider
     */
}
