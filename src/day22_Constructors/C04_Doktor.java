package day22_Constructors;

public class C04_Doktor {

    C04_Doktor(){
        System.out.println("parametresiz constructor calisti");
    }


    String isim = "Isim atanmamis";
    String soyIsim = "Soyisim atanmamis";
    String telNo;
    String adres;
    int yas;
    boolean izindeMi;
    char evliMi;
    int ekMesaiUcreti=20;

    public int mesaiUcretiHesapla (int mesaiSaati){
        return mesaiSaati*ekMesaiUcreti;

    }

    @Override
    public String toString() {
        return "C04_Doktor{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", telNo='" + telNo + '\'' +
                '}';
    }
    public C04_Doktor(String isim,String soyIsim, int yas,char evliMi){
        this.isim=isim;
        this.soyIsim=soyIsim;
        this.yas =yas;
        this.evliMi=evliMi;
    }
}
