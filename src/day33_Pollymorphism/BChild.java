package day33_Pollymorphism;

import java.util.List;

public class BChild extends AParent{

    @Override
    void method1(){
        //super.method1();
        // burada super. olursa hem Child class'daki method1()
        // hem de super class'daki method1() calisir
    }



    void method2(){
        /*
            Bir method override edildiginde
            Child class'da @Override notasyonu KULLANILABILIR

            kullanmak veya kullanmamak arasinda pratikte söyle bir sonuc olusur

            eger notasyon kullanilirsa
            iki method arasi iliski takip edilir
            parent class'daki method silinirse
            notasyon CTE verir

            notasyon yoksa parent class'daki Overridden method silinirse
            bir uyari vermez, CTE olusmaz
         */

    }

    List<Integer> method3(){
        /*
            Overridden method ile overridding method'un
            isim ve signature'lari ayni olmalidir

            return type ve access modifier
            signatur'a dahil degildir
            ancak overriddeng'De bunlarla ilgili kurallar vardir

            1- access modifier kurali:
                - child parent'i kisitlayamaz

                eger overridden ve overriding method'lari
                private yaparsak
                bu iki method BAGIMSIZ OLARAK calisir
                aralarinda override islemi olmaz

           2- Return type kurali
                - Return Type primitive veya void ise
                  iki method'un return type'i AYNI OLMALIDIR

                  non-primitive oldugunda
                  ya ayni olmalidir
                  veya parent class`daki return Type
                  Child class'daki return type'in parent'i OLMALIDIR
                  (Covariant data)
         */

        return null;
    }

}
