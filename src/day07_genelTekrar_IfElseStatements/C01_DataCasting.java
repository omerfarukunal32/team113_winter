package day07_genelTekrar_IfElseStatements;

public class C01_DataCasting {
    public static void main(String[] args) {

        // Java'da bazi data türleri baska data türlerine asla cevrilemez

        /*
        String str1=false;
        String str2=20;
        boolean bl1='a';
        int sayi1="Merhaba";
         */

        // özellikle sayisal data türündeki degerler,
        // baska sayisal dara türündeki variable'lara atanabilir

        double db1=23;
        short sh1=12;

        int sayi2=sh1;

        // daha dar data türündeki degeri, daha genis data türündeki variable'a atamaya
        // Autowidening denir ve Java bunu otomatik yapar

        sh1=(short) sayi2;
        sayi2=(int) db1;

        // daha gens data türündeki degeri, daha dar data türündeki variable'a atamaya
        // Explicit Narrowing denir ve Java bunu otomatik yapmaz. Bizden onay ister

        sayi2='k';

        if(sayi2> 'd');

        // char data tprpndeki degerler, sayisal islemlerde kullanilmaz
        // bir char matematiksel islemde kullanilirsa ASCII Table'daki degeri ile isleme girer


        System.out.println('k'+1); //108
        // eger bu islemin harf olarak yazdirmasini istiyorsak ifadenin önüne (char) koyuyuoruz

        System.out.println((char)('k'+1));
    }
}
