package day31_Inheritance;

public class EPersonel {

    String isim="Personel isim belirtilmemis";
    String unvan="Personel unvan belirtilmemis";
    boolean izindeMi;

    public void standardMaas(){

        System.out.println("Personel asgari ucreti : "+8500);
    }
    public void ozelSigorta(){

        System.out.println("Personelden katki payi alinarak ozel sigorta yapilir");
    }

}
