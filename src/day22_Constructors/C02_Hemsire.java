package day22_Constructors;

public class C02_Hemsire {

    /*
        Ornegin bir hastane programinda,
        hastane de calisacak hemsirelerin hangi bilgilerini tutmak istiyorsak,
        hangi method'lari hemsireler icin kullanmak istiyorsak
        bir hemsire class'i olusturup
        tüm bu özellikleri ( variable ve method'lari) o class'da olustururuz

        programda ne zaman bir hemsire'ye ihtiyac olsa
        hemsire class'indan obje olustururuz.
        böylece otomatik olarak tüm özelliklere sahip olur

        Eger biz istedigimiz parametrelere sahip bir constructor olusturmazsak
        Java class'dan obje olusturulabilmesi icin Class'a default bir constructor koyar

        Default constructor GÖRÜNMEZ
        Parametresi yoktur,
        Constructor bady'si bostur

        =====================================
        C02_Hemsire (){

        }
        =====================================

        Biz de istedigimiz parametrelere sahip,
        istedigimiz kadar constructor olusturabiliriz

        Cok Önemli !!!: Eger biz constructor olusturuyorsak
                        yani class'da gözle görünen bir constructor varsa
                        Java default consructor'i siler
                        Bizim olusturdugumuz hic bir constructor'a default constructor DENEMEZ
     */

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

}
