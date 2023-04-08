package day22_Constructors;

public class C07_ArabaRunner {
    public static void main(String[] args) {  // 1. sirada main method calisir calisir

        C06_Araba araba1 = new C06_Araba();  // 2. sirada araba Class'inda default constructor var.
                                            // Arabayi olusturur standart özellikleri yapistirir

        araba1.marka="Toyota";      // simdi araba1 objesine deger atamasi yaptik
        araba1.model="Corolla";     //
        araba1.hasarliMi = false;   //
        araba1.yil = 2017;          //
        araba1.fiyat = 5250;         //

        System.out.println("Marka :"+araba1.marka+", Model : "+araba1.model);

        // toString() olusturduk ve bütün öyellikleri yazdirabildik

        System.out.println(araba1);

        C06_Araba araba2 = new C06_Araba("Honda","Jazz",true,2010,3000);

        System.out.println(araba2);

        C06_Araba araba3 = new C06_Araba("VW","Jetta",false,2012,7200);
        System.out.println(araba3);

        araba3.yakitTuketimi("Benzin");



    }
}
