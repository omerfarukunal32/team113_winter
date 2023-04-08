package day16_Scope_arrays;

public class C01Hastane {

    public static void main(String[] args) {

        ADoktor dok1 = new ADoktor();
        System.out.println(dok1.askerlikYaptimi); // false
        dok1.isim = "Kemal";
        dok1.soyisim = "Yilmaz";
        dok1.dogumYili = 1980;

        System.out.println(dok1.isim);

        ADoktor dok2 = new ADoktor();
        System.out.println(dok2.isim); // null
        dok2.soyisim="Celik";
        System.out.println(dok2.soyisim); // Celik
        System.out.println(dok1); // referansini yazdirir

        System.out.println(dok1.fakulte); //Tip
        System.out.println(dok2.fakulte); //Tip

        dok1.isim="Burcu";
        System.out.println(dok2.isim); //null

        dok1.fakulte="Tip fakultesi";
        System.out.println(dok2.fakulte); // Tip fakultesi

        //ADoktor dok3= new ADoktor();
        //System.out.println(dok3.dogumYili); //
        //System.out.println(dok3.fakulte);   // tIP fAKULTESI

        System.out.println(ADoktor.fakulte);
        // static variable'lar icin tavsiye edilen erisim yöntemi
        // classismi.staticUyeIsmi seklinde yazilir
        // bu kullanim bicimine static yöntem denir
    }
}
