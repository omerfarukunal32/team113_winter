package day31_Inheritance;

public class Hemsire extends FMuhasebe{

    String unvan = "Hemsire";

    public void standartMaas(){
        System.out.println("Hemsireler minimum 1000 Tl maas alirlar");
    }
    public void ozelSigorta(){
        System.out.println("Hemsireler aylik 300 TL katki ile saglik sigortasi yaptirabilir");
    }
    public void nobetUcreti(int nobetSayisi){
        System.out.println(nobetSayisi*200);
    }

    public static void main(String[] args) {
        Hemsire hemsire = new Hemsire();
        hemsire.method();
    }

    public void method() {

        System.out.println(this.unvan); // Hemsire
        System.out.println(super.unvan);   // "Personel unvan belirtilmemis"
        System.out.println(this.sgkNo);  // "Calisan sgk no belirtilmedi"
        System.out.println(super.sgkNo); // "Calisan sgk no belirtilmedi"
        this.standartMaas(); // "Hemsireler minimum 1000 Tl maas alirlar"
        this.fazlaMesai(3); // 3*200=600
        super.fazlaMesai(4); // 800 , bu class'a bakmadan parent'e gider
        this.ozelSigorta(); // Hemsireler aylik 300 TL katki ile saglik sigortasi yaptirabilir
        super.ozelSigorta(); // "Personelden katki payi alinarak ozel sigorta yapilir"
    }

}
