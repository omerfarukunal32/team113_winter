package day44_Maps_enrysets;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C02_EntrySet {
    public static void main(String[] args) {
        // verilen okulMap'indeki soyisimleri buyuk harfe cevirin
        Map<Integer,String> okulMap= MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);

        okulMap=MapMethodDepo.soysimleriBuyukHarfYap(okulMap);
        System.out.println(okulMap);
    }
}
