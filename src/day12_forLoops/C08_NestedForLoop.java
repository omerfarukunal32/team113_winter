package day12_forLoops;

public class C08_NestedForLoop {
    public static void main(String[] args) {
        // dinamik olarak verilen satir ve sutun sayisina göre yildizlardan bir dikdörtgen olusturun
        /*
                * * * * *
                * * * * *
                * * * * *
         */
        int sayi=4;
        int satirSayisi = 3;
        int sutunSayisi = 5;
        for (int k = 1; k <= satirSayisi; k++) {   // satir sayisini
            for (int i = 1; i <= sutunSayisi; i++) {   // sutun sayisini
                System.out.print("* ");
            }
            System.out.println(""); // bir satirdaki tüm sutunlar bitince alt satira geciyor
        }

        System.out.println("=========================================");
        for (int i = 1; i <= satirSayisi; i++) { // satirlar
            for (int j = 1; j <= sutunSayisi; j++) {  // Sutunlar
                System.out.print("* ");

            }
            System.out.println("");

        }
        System.out.println("=========================================");
        for (int i = 1; i <sayi ; i++) {  // satirlar

            for (int j = 1; j <=sayi ; j++) {  // sutunlar
                System.out.print(i*j+" ");
            }
            System.out.println("");

        }


    }
}
