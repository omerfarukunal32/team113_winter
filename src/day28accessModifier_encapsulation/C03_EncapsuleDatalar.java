package day28accessModifier_encapsulation;

public class C03_EncapsuleDatalar {



    static private String isim = "Yildiz pazarlama";



     private int satisTutari;

    public int getToplamSatis() {
        return toplamSatis;
    }

    private int toplamSatis;

     public int a;

    public static String getIsim() {
        return isim;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatis+=satisTutari;
    }
}
