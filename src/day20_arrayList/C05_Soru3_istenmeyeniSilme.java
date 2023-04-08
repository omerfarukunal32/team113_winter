package day20_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_Soru3_istenmeyeniSilme {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir listede
        istenmeyen harf iceren elementleri silip, kalan kismini list olarak bize
        donduren bir method olusturun
         */

        List<String> Liste = C04_Soru2_KullaniciyaListeOlusturmak.kullaniciyaListOlusturtma();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kullanilmasini istemediginiz bir harf girin");
        String istenmeyenHarf = scan.next().substring(0,1);

        List<String> ayiklanmisList = isenmeyenHarfIcerenleriSil(Liste,istenmeyenHarf);
        System.out.println(ayiklanmisList); // [ali, veli, kirk, elli]

    }

    public static List<String> isenmeyenHarfIcerenleriSil(List<String> liste, String istenmeyenHarf) {

        // Mesela listemiz ali, veli, ayse, fatma ve istenmeyen harf a
        // for Loop ile elementleri ele alirken remove yaparsak List'in uzunlugu degisecegi icin sorun yasariz
        // farkli bir List olusturup, silinmeyecekleri yeni listeye kaydedelim

        List<String> kalanlarListesi = new ArrayList<>();

        for (int i = 0; i <liste.size() ; i++) {

            if (!liste.get(i).contains(istenmeyenHarf)){
                kalanlarListesi.add(liste.get(i));
            }
        }
        return kalanlarListesi;

    }

}
