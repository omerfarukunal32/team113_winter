package day11_StringManipulations_ForLoop;

public class C25_Ubung {
    public static void main(String[] args) {
        /*
        Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
                 :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.
         */
        String str="12345678";
        if (str.length()%2==0){
            System.out.println(str.substring(0,(str.length()/2))+":)"
                    +str.substring((str.length()/2),str.length()));
        }else {
            char ortancaHarf=str.charAt((str.length()+1)/2);
            System.out.println(str.substring(0,(str.length()-1)/2)+":("+str.substring((str.length()+1)/2,str.length()));
        }
    }
}
