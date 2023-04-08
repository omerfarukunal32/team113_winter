package day34_abstractClasses;

public class DGocmenKuslar extends BKuslar {
    /*
        Sadece ayrimi belirtmek icin abstract olmayan class'lara
        CONCRETE Class denir

        1. Abstract bir class parent'i olan abstract class`daki
        abstract method'lari Implement etmek zorunda degildir

        isterse Implement edip body'li yani Concrete hale getirir
        isterse yok sayar.

        2. Abstract bir silsileden sonra gelen
        ilk concrete class
        parent veya grandParent(s) olan
        abstract class'larda
        concrete yapilmayan tum abstrackt class'lari
        Implement etmek Zorundadir
     */

    @Override
    public void hareket() {

    }

    @Override
    public void beslenme() {

    }

    @Override
    public void omur() {

    }
}
