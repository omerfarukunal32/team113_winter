package day10_StringManipulation;

public class C06_lastIndexOf {
    public static void main(String[] args) {

        String str="Java bazen beyin yakar";

        System.out.println(str.length()); // 22

        System.out.println(str.indexOf("a")); // 1

        System.out.println(str.lastIndexOf("a"));             // 20     a' yi aramaya sondan baslar
        System.out.println(str.indexOf("a",2));      // 3
        System.out.println(str.lastIndexOf("a",19)); // 18
        System.out.println(str.indexOf("a",4));      // 6
        System.out.println(str.lastIndexOf("a",17)); //6

        System.out.println(str.indexOf('e'));                    // 8
        System.out.println(str.lastIndexOf('e'));            // 12
        System.out.println(str.lastIndexOf("Mustafa"));      // -1
        
        /*
         Verilen bir cumlede istenen bir String ıcın asagıdakı cumlelerden uygun olanı yazdırın
         1- Aaradıgınız kelıme cumlede 1 kere kullanılmıs
         2- Aradıgınız kelıme cumlede 1'den fazla kullanılmıs
         3- aradiginiz kelime cümlede hic kullanilmamis
         
         */

        String cumle="Yasasin java, iyi ki java ogreniyorum";
        String kelime= "java";
        
        int ilkIndex=cumle.indexOf(kelime);
        int lastIndex=cumle.lastIndexOf(kelime);
        
        if(ilkIndex==(-1)){
            System.out.println("aradiginiz kelime cümlede hic kullanilmamis");
        } else if (ilkIndex==lastIndex) {
            System.out.println("Aaradıgınız kelıme cumlede 1 kere kullanılmıs");
        } else {
            System.out.println("Aradıgınız kelıme cumlede 1'den fazla kullanılmıs");
        }

    }
}
