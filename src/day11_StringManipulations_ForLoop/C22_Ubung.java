package day11_StringManipulations_ForLoop;

public class C22_Ubung {
    public static void main(String[] args) {
        /*
        Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
                 sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
                 input : java1 ogRe2@nMek3 #ne +Gu=zel
                 output : Java ogrenmek ne guzel.
         */
        //String input="java1 ogRe2@nMek3 #ne +Gu=zel";
        //input=input.replaceAll("\\d","").replace("@","")
        //                                    .replace("#","").replace("+","")
        //                                    .replace("=","").toLowerCase();
        //input=input.toLowerCase().replace('j','J');
        //System.out.println("Output : "+input);
        String input="java1 ogRe2@nMek3 #ne +Gu=zel";
        input=input.replaceAll("\\d","");
        input=input.replaceAll("\\s","1");
        input=input.replaceAll("\\W","");
        input=input.replaceAll("\\d"," ");
        input=input.toLowerCase();
        System.out.println((char) (input.charAt(0)-32)+input.substring(1,input.length())+".");


    }
}
