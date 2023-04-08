package day10_StringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {

        String str= "Java cok ama cok güzel";

        System.out.println(str.indexOf("c"));   // 5
        System.out.println(str.indexOf("a"));   // 1 birden fdazla ise ilk buldugunu verir
        System.out.println(str.indexOf("cok")); // 5 cok'u bir paket yapar ve 1 karakter olarak degerlendirir
        System.out.println(str.indexOf("cok",6)); // 13  6. index ten sonraki ilk cok
        System.out.println(str.indexOf("cok",5)); // 5
        System.out.println(str.indexOf("java")); // -1 aranan String yoksa, -1 döner


        /*
         Verilen bir cumlede istenen bir String ıcın asagıdakı cumlelerden uygun olanı yazdırın
         1- Aaradıgınız kelıme cumlede bır kere kullanılmıs
         2- Aradıgınız kelıme cumlede 2 kere kullanılmıs
         3- Aradıgınız kelıme cumlede 2'den fazla kullanılmıs
         4- aradiginiz kelime cümlede hic kullanilmamis
         */

        String cumle="Yasasin java, iyi ki java ogreniyorum";
        String kelime= "java";

        if(cumle.indexOf(kelime)==(-1)){
            System.out.println("aradiginiz kelime cümlede hic kullanilmamis");
        } else {
            int kelimeIlkIndex= cumle.indexOf(kelime); // 8
            if(cumle.indexOf(kelime,(kelimeIlkIndex+1))==(-1)){
                System.out.println("Aaradıgınız kelıme cumlede bır kere kullanılmıs");
            } else {
                int ikinciKelimeIndex=cumle.indexOf(kelime,(kelimeIlkIndex+1)); //21
                if (cumle.indexOf(kelime,(ikinciKelimeIndex+1))==(-1)){
                    System.out.println("Aradıgınız kelıme cumlede 2'den fazla kullanılmıs");

                }
            }
        }


    }
}
