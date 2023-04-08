package day15_doWhileLoop_scope;

public class C21_soru3 {
    public static void main(String[] args) {
        // Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun.

        String str="heimelig";
        System.out.println(terseCevirme(str));


    }
    public static String terseCevirme(String str){

        String yeniStr="";
        int sayac=str.length()-1;
        while (sayac>=0){
            yeniStr+=str.charAt(sayac);
            sayac--;
        }
        return yeniStr;
    }
}
