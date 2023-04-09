package day28accessModifier_encapsulation;

public class C03_EncapsuleDatalar {



    static private String isim = "Yildiz pazarlama";

     private int satisTutari;

    public int toplamSatis;

    public int x;

    public int a;

    public int getToplamSatis() {
        return toplamSatis;
    }

    public static String getIsim() {
        return isim;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatis+=satisTutari;
    }
}
