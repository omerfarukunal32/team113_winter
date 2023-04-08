package day10_StringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str = "Java ne kadar güzel";
        // substring iki farkli sekilde kullanilablir
        // 1- Tek parametre olursa, o index'den baslar sonuna kadar yazdirir

        System.out.println(str.substring(8)); // kadar güzel

        System.out.println(str.substring(0)); // Java ne kadar güzel

        System.out.println(str.substring(str.length() - 3)); // zel

        System.out.println(str.substring(str.length())); // l'den sonraki hicligi yazdirir

        // System.out.println(str.substring(str.length()));  str'nin uzunlugu 19, son harfin index'i 18
        //                                                      19.index'de karakter yok


        // 2- Iki parametre girilirse beginIndex'inden (dahil) baslar
        //    endIndex'ine (haric) kadar olan bölkümü yazdirir

        System.out.println(str.substring(5, 7));  // ne

        System.out.println(str.substring(3, 4)); // a

        System.out.println(str.substring(0, 1));  // J

        // str'in 5.index'deki karakterini yazdirin
        System.out.println(str.charAt(5));        // n
        System.out.println(str.substring(5, 6));  // n

        System.out.println(str.substring(2,2));   // hiclik

        System.out.println(str.substring(5, 1));  // Run Time Error!!!


    }
}
