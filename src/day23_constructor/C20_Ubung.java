package day23_constructor;

public class C20_Ubung {
    String isim="Lohn Doe";
    int yas = 40;

    public C20_Ubung(String isim, int yas){
        this.isim=isim;
        this.yas=30;
    }

    public static void main(String[] args) {

        C20_Ubung obj = new C20_Ubung("Fatih",35);
        System.out.println("isim : "+obj.isim+" yas : "+obj.yas);
    }
}
