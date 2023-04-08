package day09_Switch_StringManipulation;

public class C06_charAt {
    public static void main(String[] args) {

        String str ="Java Candir";

        System.out.println(str.charAt(0));

        // bastan 6. harfi yazdirin
        System.out.println(str.charAt(5));

        // sondan ikinci harfi yazdirin

        System.out.println(str.charAt(11-2));  // i

        // son harfi yazdirin

        System.out.println(str.charAt(11-1)); //r

        // System.out.println(str.charAt(11));

        //System.out.println(str.charAt(15));

        /*
        Java'da iki türlü hata ile (exeption) karsilasabiliriz
        1- syntax olarak hatali yazilan kodlari Java compile ederken anlar ve altini kirmizi cizer
            str =23; String bir variable'a int deger atanamayacagini bilir ve altini kirmizi cizer
            CompileTimeError (CTE) diyoruz
        2- Bazen de syntax' de hata olmaz
            Java bunu calismaya basladiktan sonra farkeder
            str.charAt(15) : Burada verilen str'den bir karakter isteniyor
            compile time'da str'nin uzunlugunu Java anlamaz
            ama calisinca 15. index'in olmadigini farkeder ve exeptin firlatir
            RunTimeError (RTE) deriz
         */

    }
}
