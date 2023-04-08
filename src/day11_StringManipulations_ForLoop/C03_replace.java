package day11_StringManipulations_ForLoop;

public class C03_replace {
    public static void main(String[] args) {
        String str= "Java Candir";

        System.out.println(str.replace("J", "H"));  // Hava Candir

        System.out.println(str.replace("a",""));  // Jv Cndir

        System.out.println(str.replace("Java","X"));  // X Candir

        System.out.println(str.replace("v","yayaya"));  // Jayayayaa Candir

        System.out.println(str.replace(" ","X"));  // JavaXCandir

        str.replace("va","lala"); // yapilan degisiklik bu satiricindir
        // yazdirilmadigi icin göremeyiz. Atama yapilmadigi icin de kalici olmaz

        // str'daki space'leri yok edin
        str=str.replace(" ","");

        System.out.println(str); // JavaCandir

        str=str.replaceFirst("a","");
        System.out.println(str);  // JvaCandir
        System.out.println(str.replaceFirst("C","K")); // JvaKandir
    }
}
