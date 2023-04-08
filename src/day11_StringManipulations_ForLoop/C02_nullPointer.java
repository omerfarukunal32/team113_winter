package day11_StringManipulations_ForLoop;

public class C02_nullPointer {
    public static void main(String[] args) {

        // null bir deger degildir
        // null bir pointer`dir, yanina yazilan non-primitive variable'a deger atanmadigina isaret eder.

        String str;   // burada str olusturuldu ama deger atanmadi

        // Java method icerisinde deger atamadan variable olusturulmasina izin verir
        // ama deger atamadan kullanilmasina izin vermez

        // System.out.println(str); CTE
        // str.concat("Java");   CTE

        // Bazen programlarda variable'lar olusturulur ama,
        // daha sonra deger atanacagi icin deger atamasi yapilmaz
        // deger atamasi yapilmadan Listeleme bile CTE verdigi icin
        // deger verilmedigini isaretleyecek, ama CTE olusmasini engelleyecek
        // bir cözüm olarak null pointer olusturulmusutur

        str=null;  // str="null" degildir.
                    // null olarak isaretlenmis, degeri null atanmis degil

        System.out.println(str); // null
        //  System.out.println(str.concat("Java"));  // Run Time Error---- NullPointerExeption

        // System.out.println(str.length());

        System.out.println(str+"Java"); // nullJava
        String str2=str + "Java";
        System.out.println("str2 :" + str2);  // nullJava

        // int sayi= null;  primitive variable'lara null degeri olmaz
        Integer sayi= null;

        // biz genelde String bir ifade olusturup, sonra deger atayacasak
        // hiclik degeri atariz

        String str3="";  // str3'e deger atanmistir.
                            // atanan deger hicliktir

        System.out.println(str3.concat("Java"));  // Java

        //  System.out.println(str.isEmpty()); //  NullPointerException
        // null olarak isaretlenen bir String hicbir method la kullanilamaz
        // sadece yazdirilabilir veya + ile kullanilabilir

        System.out.println(str3.isEmpty());  //true


    }
}
