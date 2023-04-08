package day44_Maps_enrysets;

import java.util.Map;
import java.util.TreeMap;

public class C03_Compute_sonuAnlamadim {
    public static void main(String[] args) {
        /*
            Verilen String bir array'de her bir harfin kacar defa kullanildigini yazdiralim
            Ornek : String[] arr = {"A","C","B","N","A","N","A"}
                                Output : A=3, B=1, C=1 , N=2
         */
        String[] arr = {"A","C","B","N","A","N","A"};

        Map<String,Integer> kullanimMiktari = new TreeMap<>();

        // contains() kullanarak yapalim
        // arr'deki herbirr elementi ele alalim
        for (String each:arr
             ) {
            // Eger ele aldigim element map'de yoksa
            // map'e element, 1 eklerim

            if (!kullanimMiktari.containsKey(each)){
                kullanimMiktari.put(each,1);
            }else {
                // eger oelement daha once map'de varsa
                // o zaman value'yu 1 artirmamiz lazim
                int elementinEskiKullanimMiktari = kullanimMiktari.get(each);
                kullanimMiktari.put(each,elementinEskiKullanimMiktari+1);
            }
        }
        System.out.println(kullanimMiktari);


        // compute method'lari kullanarak da yapabiliriz

        Map<String,Integer> kullanim2 = new TreeMap<>();

        for (String eachHarf:arr
             ) {
            // Eger o element daha once map'de varsa
            // o zaman value'yu 1 artirmamiz lazim

            kullanim2.computeIfPresent(eachHarf,(k,v)->v+1);

            // Eger ele aldigim element map'de yoksa
            // map'e element, 1 eklerim

            kullanim2.putIfAbsent(eachHarf,1);

        }
        System.out.println(kullanim2);
    }
}
