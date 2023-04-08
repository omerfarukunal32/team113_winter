package day35_Interfaces;

public class C02_ChildofI01andI03 implements I01_Interface,I03_Interface {

    /*
        Interface'in EN ÖNEMLI ARTISI
        bir class'in birden fazla interface'i implement edebilmesidir
        bir class'i extens ile de baska bir class'a child yapabiliriz

        Ancak birden fazla interface'i implement ederken
        dikkat etmemiz gereken bir konu vardir

        eger implement etmek istedigimiz farkli interface'lerde
        ayni isimde fakat farkli return type'i olan method'lar varsa
        iki method'u ayni anda implement edemeyecegimiz icin
        o iki interface'den ancek birini implement edebiliriz
     */

    @Override
    public void toplama() {

    }

    @Override
    public void cikarma() {

    }

    @Override
    public String ekleme() {
        return null;
    }

    @Override
    public int faktoriyel() {
        return 0;
    }

    @Override
    public void bolme() {

    }

    public static void main(String[] args) {
        C02_ChildofI01andI03 obj = new C02_ChildofI01andI03();

        System.out.println(I01_Interface.str);
        System.out.println(I03_Interface.str);
        System.out.println(I02_Interface.str);

    }


}
