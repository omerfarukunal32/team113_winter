package day12_forLoops;

public class C20_Ubung1 {
    public static void main(String[] args) {
        /*
        Soru 1- 1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak
                yazdirin.
        */
        //for (int i = 1; i <=100 ; i++) {
        //    System.out.print(i+" ");
        //==================================================
        /*
        Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
                dahil) 7 ila bolunebilen sayilari yazdirin.
         */
        //int sayi=49;
        //for (int i = 1; i <=sayi ; i++) {
        //    if (i%7==0){
        //        System.out.print(i+", ");
        //    }
        //}
        //=======================================================
        /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
                dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
                baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
        */
        //int bas=10;
        //int bit=12;
        //int toplam=0;
        //if (bit<bas){
        //    System.out.println("Bitis degeri baslangic degerinden büyük olmali");
        //}else {
        //    for (int i = bas; i <=bit ; i++) {
        //        toplam+=i;
        //    }
        //    System.out.println(toplam);
        //}
        //=========================================================
        /*
        Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
                dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
                baslangic degerinden kucuk olsa da program calissin
         */
        //int bas=10;
        //int bit=8;
        //int toplam=0;
        //if(bas<bit){
        //    for (int i = bas; i <=bit ; i++) {
        //        toplam +=i;
        //    }
        //    System.out.println(toplam);
        //}else {
        //    for (int i = bit; i <=bas ; i++) {
        //        toplam +=i;
        //    }
        //    System.out.println(toplam);
        //}
        //=============================================================
        /*
        Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.
         */
        //int sayi=5;
        //int faktoriyel=1;
        //for (int i = 1; i <=sayi ; i++) {
        //    faktoriyel *=i;
        //}
        //System.out.println(faktoriyel);
        //=====================================================
        /*
        Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
                hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
                Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        */
        //int sayi=5;
        //int faktoriyel=1;
        //System.out.print(sayi+"!"+" = ");
        //for (int i = sayi; i >=1 ; i--) {
        //    faktoriyel*=i;
        //    if (i!=1){
        //        System.out.print(i+"*");
        //    }else {
        //        System.out.print(i+"");
        //    }
        //}
        //System.out.println(" = "+faktoriyel);
        //====================================================
        /*
        Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
         */
        //int sayi=6;
        //int toplam=0;
        //for (int i = 1; i <=sayi ; i++) {
        //    toplam+=i;
        //}
        //System.out.println(toplam);
        //=======================================
        /*
        Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
                            tamsayilari yazdirin, sira
                            - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
                            - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
                            - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin
         */
        //int sayi=20;
        //for (int i = 1; i <=sayi ; i++) {
        //    if (i%3==0&&i%5==0){
        //        System.out.print("fizzbuzz ");
        //    } else if (i%3==0) {
        //        System.out.print("fizz ");
        //    }else if (i%5==0) {
        //        System.out.print("buzz ");
        //    }else {
        //        System.out.print(i+" ");
        //    }
        //}
        //====================================================
        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        //String str1="Der Außendienst";
        //String str2="";
        //for (int i = str1.length()-1; i >=0 ; i--) {
        //    str2+=str1.charAt(i);
        //}
        //System.out.print(str2);
        //============================================================
        // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
        //String str1="Java mava";
        //String str2="";
        //for (int i =str1.length()-1; i >=0 ; i--) {
        //    str2 += str1.charAt(i);
        //}
        //System.out.println(str2);
        //================================================================
        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        //int sayi=17;
        //int flag=0;
//
        //for (int i = 2; i <sayi ; i++) {
        //    if (sayi%i==0){
        //        flag++;
        //        break;
        //    }
        //}
        //if (sayi==2){
        //    System.out.println("Girilen "+sayi+" sayisi asal bir sayidir");
        //} else if (flag==0) {
        //    System.out.println("Girilen "+sayi+" sayisi asal bir sayidir");
        //}else {
        //    System.out.println("Girilen "+sayi+" sayisi asal bir sayi degildir");
        //}

    }
}
