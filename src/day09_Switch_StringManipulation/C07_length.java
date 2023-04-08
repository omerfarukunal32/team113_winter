package day09_Switch_StringManipulation;

public class C07_length {
    public static void main(String[] args) {

        String str="Java gün gectikce güzellesiyor";

        // bu cümledeki karakter sayisini yazdirin

        System.out.println(str.length()); //30

        // bu cümledeki son karakteri yazdirin

        System.out.println(str.charAt(str.length()-1)); //r

        // sondan ücüncü karakteri yazdirin

        System.out.println(str.charAt(str.length()-3)); // y
    }
}
