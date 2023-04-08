package day36_exceptions;

public class C01_TryCatchEksik {
    public static void main(String[] args) {

        /*
            Kodlarimizi yazarken
            sorun olusma ihtimali gordugumuzde
            sorun cikma potansiyeli olan kodlari
            try - catch - (finally) blok(lari) ile vevreleriz

         */


        int sayi1=20;
        int sayi2=0;


        try {

            System.out.println(sayi1/sayi2);

        } catch (ArithmeticException e) {

            // e.printStackTrace();   exception'da gordugumuz tum hata aciklamalarini yazdirir
            // System.out.println("Bolen sayi sifir olamaz");
            // System.out.println(e.getMessage());   / by zero      hatanin kaynagini gosterdi
            // System.out.println(e.getCause());
        }


        /*
            Bir try-catch blogu 3 bolumden olusur
                1- try blogu          : 19-23(haric)
                   exception olusturma potansiyeli olan kodlar
                2- catch (Exception e)
                   catch statement    :
                   ArithmeticException: olusma ihtimali olan exception
                                    e : karsilastigi exceotion'i kaydedecegimiz obje( Arit.... class'indan bir obje)
                3-catch blog'u         :
                                           ongorulen exception


         */

    }
}
