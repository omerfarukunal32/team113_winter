package day32_inheritance_dataTypeKullanimi;

public class HAvciKuslar extends GKuslar {
    public void hareket(){
        System.out.println("ucarlar");
    }
    public void beslenme(){
        System.out.println("et yerler");
    }
    public void pence(){
        System.out.println("pencelidir");
    }
    public void gaga(){
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        HAvciKuslar kartalAvci = new HAvciKuslar();

        kartalAvci.hareket(); // ucarlar - H cons. ile data turu ayni old. icin buldugu ilk
        kartalAvci.beslenme();// et yerler - H
        kartalAvci.pence();   // pencelidir - H
        kartalAvci.gaga();    // sivri gagali - H

        kartalAvci.kanat();   // kanatlidirlar - G
        kartalAvci.solunum(); // akcigerle nefes alirlar - G
        kartalAvci.cogalma(); // yumurtayla cogalirlar - G

        kartalAvci.omur();    // yasar ve olurler - F


        System.out.println("=======================");

        GKuslar kuslar = new GKuslar();

        kuslar.hareket();   // hareket ederler - F
        kuslar.beslenme();  // beslenirler - F
        // kuslar.pence();  // CTE
        kuslar.gaga();      // gagalari vardie - G

        kuslar.kanat();     // kanatlidirlar - G
        kuslar.solunum();   // akcigerle nefes alirlar - G
        kuslar.cogalma();   // yumurtayla cogalirlar - G

        kuslar.omur();      // yasar ve olurler - F


        System.out.println("========================");


        GKuslar kartalKus = new HAvciKuslar();

        kartalKus.hareket();   // Ucarlar - H
        kartalKus.beslenme();  // et yerler - H
        // kartalKus.pence();  // CTE
        kartalKus.gaga();      // sivri gagali - H

        kartalKus.kanat();     // kanatlidirlar - G
        kartalKus.solunum();   // akcigerle nefes alirlar - G
        kartalKus.cogalma();   // yumurtayla cogalirlar - G

        kartalKus.omur();      // yasar ve olurler - F

        System.out.println("====================");


        FHayvanlar hayvanlar = new FHayvanlar();

        hayvanlar.hareket();  // hareket ederler - F ,  cons. ile data turu ayni old. icin bu class a bakacaz ve buldugu ilk degeri yazarim
        hayvanlar.beslenme(); // beslenirler - F
        //hayvanlar.pence();  // CTE
        //hayvanlar.gaga();   //  CTE

        // hayvanlar.kanat(); // CTE
        hayvanlar.solunum();  // nefes alirlar - F
        hayvanlar.cogalma();  // cogalirlar - F

        hayvanlar.omur();     // yasar ve olurler - F

        System.out.println("===================");


        FHayvanlar kartalHayvani = new HAvciKuslar();

        kartalHayvani.hareket();   // ucarlar - H cons. ile data turu ayni degil override edilmis mi bakarim
        kartalHayvani.beslenme();  // et yerler - H
        // kartalHayvani.pence();  // CTE
        //kartalHayvani.gaga();    // CTE

        //kartalHayvani.kanat();   // CTE
        kartalHayvani.solunum();   // akcigerle nefes alirlar - G
        kartalHayvani.cogalma();   // yumurtayla cogalirlar - G

        kartalHayvani.omur();      // yasar ve olurler - F



        /*
            Ozellikler method olarak olusturulmus ise

            data turu ve constructor AYNI ise
            o class'da aramaya baslarim
            buldugum ilk gegeri kullanirim


            data turu ve constructor farkli ise

            data turu olan class'dan aramaya baslar
            o class veya parent class'larinda
            bulamazsa CTE verir

            o class veya parent class'larinda bulursa
            override edilmis mi kontrol eder
            ve en guncel bilgiyi bulup yazdirir
         */

    }
}
