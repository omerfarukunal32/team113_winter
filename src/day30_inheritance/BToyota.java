package day30_inheritance;

public class BToyota extends Araba {

    String marka = "Toyota";
    String aku = "Inci";
    String lastik = "Bridgestone";
    public void motor(){
        System.out.println("Toyotalar cevreci toyota motoru kullanir");
    }
    public void guvenlik(){
        System.out.println("Toyota araclar extra guvenlik onlemleri kullanir");
    }
}
