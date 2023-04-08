package day35_Interfaces;

public interface I04_InterfaceIstisnalar {

    // void cikarma(){}     bunun bady'si olamaz.
    void toplama();

    static void aciklama(){
        System.out.println("Bu method'u implement etmek mecburi degil");
    }

    default void ekIsler(){
        System.out.println("Default keyword ile body'si olan bir method olusturulabilir");
    }

}
