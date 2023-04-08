package day30_inheritance;

public class CToyotaCorolla extends BToyota {
    String lastik = "Lassa 205-55-15";
    public void motor(){
        System.out.println("Corolla araclar turkiyede uretilen motor kullanir");
    }
    String model = "Corolla";
    String yakit = "Corolla dizel,benzinli ve elektrikli olabilir";
    public void uretimYeri(){
        System.out.println("Corolla araclar turkiyede uretilir");
    }
    public static void main(String[] args) {
        CToyotaCorolla corolla = new CToyotaCorolla();
        System.out.println(corolla.lastik); // Corolla Class'i
        System.out.println(corolla.model); //  Corolla
        System.out.println(corolla.yakit); // Corolla
        corolla.motor(); // Corolla
        corolla.uretimYeri(); // Crolla
        System.out.println(corolla.marka); // Toyota
        System.out.println(corolla.aku); // Toyota
        corolla.guvenlik(); // Toyota
        System.out.println(corolla.vites); // Araba
    }

}
