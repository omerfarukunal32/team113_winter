package day09_Switch_StringManipulation;

import java.util.Locale;

public class C03_toUpperCase_toLowerCase {
    public static void main(String[] args) {

        String str="Java Candir";

        // str'i büyük harf olarak yazdirin

        System.out.println(str.toUpperCase()); // JAVA CANDIR
        System.out.println(str); // Java Candir

        // String Manipulation yaptktan sonra asil variable'a atama yapilmaz ise, asil Variable degismez

        str=str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        System.out.println(str.toLowerCase()); // java candir

        // str'i türkce karakterleri gözönünde bulundurarak kücük harfe cevirin

        str=str.toLowerCase(Locale.forLanguageTag("TR"));

        System.out.println(str); // java candır
    }
}
