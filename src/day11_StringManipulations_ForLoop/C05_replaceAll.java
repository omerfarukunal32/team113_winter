package day11_StringManipulations_ForLoop;

public class C05_replaceAll {
    public static void main(String[] args) {
        String str = "Java54 C+an01dir,,,";

        // str'i Java Candir haline gettirin


        str=str.replaceAll("\\d","");
        str=str.replaceAll(" ","5");

        str=str.replaceAll("\\W","");

        System.out.println(str); // Java5Candir

        str=str.replaceAll("5"," ");
        System.out.println(str); //  Java Candir
    }


}
