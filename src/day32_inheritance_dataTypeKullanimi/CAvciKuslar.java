package day32_inheritance_dataTypeKullanimi;

public class CAvciKuslar extends BKuslar {
    String hareket = "Ucarlar";
    String beslenme = "Et yerler";
    String pence = "Pencelidir";
    String gaga = "Sivri gagali";

    public static void main(String[] args) {

        CAvciKuslar kartalAvci = new CAvciKuslar();

        System.out.println(kartalAvci.hareket); // Ucarlar
        System.out.println(kartalAvci.beslenme); // Et yerler
        System.out.println(kartalAvci.pence); // Pencelidir
        System.out.println(kartalAvci.gaga); // Sivri gagali

        System.out.println(kartalAvci.kanat); // Kanatlidirlar
        System.out.println(kartalAvci.solunum); // Akcigerle nefes alirlar
        System.out.println(kartalAvci.cogalma); // Yumurtayla cogalirlar

        System.out.println(kartalAvci.omur); // Yasar ve olurler

        System.out.println("=====================================");


        BKuslar kartalKus = new CAvciKuslar();

        System.out.println(kartalKus.hareket); // Hareket Ederler - A
        System.out.println(kartalKus.beslenme); // Beslenirler -A
        // System.out.println(kartalKus.pence); // CTE
        System.out.println(kartalKus.gaga); // Gagalari vardir - B

        System.out.println(kartalKus.kanat); // Kanatlidirlar -B
        System.out.println(kartalKus.solunum); // Akcigerle nefes alirlar -B
        System.out.println(kartalKus.cogalma); // Yumurtayla cogalirlar -B

        System.out.println(kartalKus.omur); // Yasar ve olurler -A

        System.out.println("===================================");


        AHayvanlar kartalHayvan = new CAvciKuslar();
        System.out.println(kartalHayvan.hareket); // Hareket Ederler - A
        System.out.println(kartalHayvan.beslenme); // Beslenirler -A
        //System.out.println(kartalHayvan.pence); // CTE
        //System.out.println(kartalHayvan.gaga); // CTE

        //System.out.println(kartalHayvan.kanat); // CTE
        System.out.println(kartalHayvan.solunum); // nefes alirlar -A
        System.out.println(kartalHayvan.cogalma); // cogalirlar -A

        System.out.println(kartalHayvan.omur); // Yasar ve olurler -A

        System.out.println("================================");

        // Variable olarak ozellikleri olusturursak
        BKuslar kuslar = new BKuslar();
        BKuslar avciKuslar = new CAvciKuslar();
        // bu iki obje arasinda bir fark göremeyiz



        /*
            Eger bir obje olusturulurken
            data turu ve constructor ayni ise
            aradigimiz ozellikler icin direk o class'a gider
            ve ozellikleri arariz

            Eger data turu ve constructor farkli ise
            variable ve method'lar farkli davranirlar

            variable'lar
            - once data turunun oldugu class'a bakar
              o variable'i bulursa degeri yazdirir
              bulamazsa data turunun parent'ina bakar
              orada bulursa degeri yazdirir
              orada da bulamazsa CTE verir


              ozetle bir ozelligi variable olarak olusturursaniz
              data turu olan class ve parentlarindaki ortak ozelliklere bakar
              ortak bilgileri arar
              en guncel bilgiyi aramaz
         */



    }

}
