package day12_forLoops;

public class C10_NestedForLoop {
    public static void main(String[] args) {
        /*
            Verilen satir sayisina göre asagidaki sekli olusturan kod yaziniz
            *
            * *
            * * *
            * * * *
         */

        int satir=4;
        for (int i = 1; i <=satir ; i++) { // satirlar Outer Loop  / Dis Döngü
            for (int j = 1; j <=i ; j++) { // sutunlar inner Loop / Ic Döngü
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
