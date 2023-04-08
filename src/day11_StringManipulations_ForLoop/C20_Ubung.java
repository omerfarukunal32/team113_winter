package day11_StringManipulations_ForLoop;

public class C20_Ubung {
    public static void main(String[] args) {
        String str1="Java ne iyidir böyle";
        String str2="w";
        //System.out.println(str1.replaceAll("\\d","")); // Java ne güzeldir
        //System.out.println(str1);  //Java15151 ne gü54zel78dir
        // Soru 1- Kullanicidan bir String ve aranacak metin alin. String'in metni icerip icermedigini yazdirin
        //System.out.println(str1.indexOf(str2));  // 10
        //if(str1.contains(str2)){
        //    System.out.println("String metni iceriyor");
        //}else {
        //    System.out.println("String metni icermiyor");
        //}


        /*
        Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
        icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini
        yazdirin
            - String aranan metni icermiyor
            - Aranan metin String’de sadece 1 kere kullanilmis
            - Aranan metin String’de sadece 1’den fazla kullanilmis
         */
        //int ilkIndex=str1.indexOf(str2);
        //int sonIndex=str1.lastIndexOf(str2);
        //
        //if(ilkIndex==(-1)){
        //    System.out.println("String aranan metni icermiyor");
        //} else if (ilkIndex==sonIndex){
        //    System.out.println("Metin 1 kez kullanilmis");
        //} else {
        //    System.out.println("Metin 1'den fazla kullanilmis");
        //}

        //===================================================

        /*
        Soru 1 - Kullanicidan bir cumle alin
                - cumlede ev geciyorsa, "home home sweet home" yazdirin
                - cumlede is geciyorsa, "calismak guzeldir"
                - ikisini de iceriyorsa "Hem ev lazim hem is"
                - hicbirini icermiyorsa "cok calisman lazim" yazdirin
        */
        //if(str1.contains("ev")&&str1.contains("is")){
        //    System.out.println("Hem ev lazim hem is");
        //} else if (str1.contains("ev")) {
        //    System.out.println("home home sweet home");
        //} else if (str1.contains("is")) {
        //    System.out.println("calismak guzeldir");
        //} else {
        //    System.out.println("cok calisman lazim");
        //}
        //===================================================================

        /*
        Soru 2 - Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
                 input1 : “15.30 €” , input2 : “11.40 €”
                 output : 26.70 €
         */

        //String str3="15.30 €";
        //String str4="11.40 €";
        //double str1Yeni=Double.parseDouble(str3.replaceAll("€","")); // 15.3
        //double str2Yeni=Double.parseDouble(str4.replaceAll("€","")); // 11.4
        //System.out.println(str2Yeni+str1Yeni+" €");

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
        // Ikinci cözüm==========
        String input="java1 ogRe2@nMek3 #ne +Gu=zel";
        input=input.replaceAll("\\d","").replaceAll("\\s","1");
        input=input.replaceAll("\\W","").replaceAll("1"," ").toLowerCase()
                                .replace('j','J');
        System.out.println("Output : "+input);





    }
}
