package day25_passByValue_ImmutableClasses;

import java.util.Locale;

public class C03_ImmutableClasse {
    public static void main(String[] args) {
        /*
            Java'da bir class ve o class'dan olusturulan objeler
            ya mutable'dir, ya da immutable'dir

            Java metinsel ifadeleri atayabilecegimiz 3 class olusturmustur
            String  ----------immutable
            StringBuilder-----mutable
            StringBuffer------mutable

            immutable bir class'dan olusturulan obje'ler de immutable'dir
            String immutable oldugundan ayni str objesine yeni deger atandiginda Java eski degeri degistiremez
            bunun yerine istenen yeni degere sahip yeni bir obje olusturur
            ve str'in pointer'ini yeni objeye yöneltir

            Kullanilmayan eski objeler
            Garbage Collektor tarafindan toplanmak üzere beklerler
         */

        String str = "Java candir";

        str = str.toLowerCase();
        System.out.println(str); // java candir

        str = str.toUpperCase();
        System.out.println(str); // JAVA CANDIR

        // Soru - Asagidaki kod calistiginda
        // Java kac obje olusturur

        String s = "Hava";

        for (int i = 0; i <100 ; i++) {
            s=s+".";
        }
    }
}
