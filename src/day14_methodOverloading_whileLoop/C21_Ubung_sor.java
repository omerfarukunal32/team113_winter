package day14_methodOverloading_whileLoop;

public class C21_Ubung_sor {
    public static void main(String[] args) {

        System.out.println(asalKontrol(5));
        System.out.println(asalKontrol(6));

    }
    public static boolean asalKontrol(int sayi){
        int flag=0;
        boolean sart=true;
        for (int i = 2; i <sayi; i++) {
            if (sayi%i==0) {
                flag++;
                break;
            }
        }
        if (flag==0){
            sart=sart;
        }else {
            sart= !sart;
        }
        return sart;

    }

}
