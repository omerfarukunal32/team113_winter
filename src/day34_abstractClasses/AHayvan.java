package day34_abstractClasses;

public abstract class AHayvan {
    /*
    Bir class'i abstract class yapmak icin deklaration'a abstract yazmak yeterlidir.

    Abstract class'lar class olduklari icin constructor'lari vardir
    ama abstact class'lardan obje olusturulamaz

    Abstract class'larda bugüne kadar kullandigimiz yapida
    method'lar olusturabiliriz. Ancak bunlar Child class'lar tarafindan
    uyarlanmak(override) yorunda olmaz

    Child class'lari uyarlamayi mecbur etmek istedigimiz methodlar'da
    abstract yapmaliyiz

    Bir method'u abstract yapmak icin
    declaration'ina abstract yazmak yeterlidir
     */

    public abstract void hareket(); // body si olamaz. olursa hata verir
    public abstract void solunum();
    public abstract void beslenme();
    public abstract void cogalma();
    public abstract void omur();
}
