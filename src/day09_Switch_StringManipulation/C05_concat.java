package day09_Switch_StringManipulation;

public class C05_concat {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Candir";
        String str3=" ";

        // yukaridaki varable'lari kullanarak "Java Candir" yazdirin

        System.out.println(str1+str3+str2); // Cancatenation

        System.out.println(str1.concat(str3).concat(str2)); // Java Candir
    }
}
