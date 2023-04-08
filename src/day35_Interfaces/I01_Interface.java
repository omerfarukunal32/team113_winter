package day35_Interfaces;

public interface I01_Interface {

    static int sayi = 10;
    final String str = "Java Candir";
    public static final boolean b = true; // gri olanlari yazmaya gerek yok.

    // interface'de tüm variable'lar (yazolmasa bile) public, static ve final'dir
    // final oldugu icin sonradan degistirme imkani yoktur, olustururken deger atanmalidir
    // bu ozellikler standart olarak tum variable'lara tanimlandigindan
    // bu tanimlamalari yapmak gerekli degildir(intelliJ gri yapti)

    void toplama();
    public void cikarma();
    abstract String ekleme();
    public abstract int faktoriyel();

    // tüm method'lar da standart olarak public ve abstract'tir (yazilmasa bile)


}
