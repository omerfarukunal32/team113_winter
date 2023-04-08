package ortakCalisma2;
import java.util.ArrayList;
import java.util.Scanner;
public class C01_Soru5_List {
    // Soru 5- Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
    //bir liste olarak bize donduren bir method olusturun.
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 ...
        System.out.println(fibo());
    }
    private static ArrayList<Integer> fibo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();
        ArrayList<Integer> fibonacci = new ArrayList<>();
        if (sayi<=0){
            System.out.println("Hatali giris");
        } else if (sayi==1) {
            fibonacci.add(0);
        } else if (sayi==2) {
            fibonacci.add(0);
            fibonacci.add(1);
            fibonacci.add(1);
        }else {
            int ilkSayi=0;
            fibonacci.add(ilkSayi);
            int ikinciSayi=1;
            fibonacci.add(ikinciSayi);
            int yeniSayi=ilkSayi+ikinciSayi;
            fibonacci.add(yeniSayi);
            while (yeniSayi<sayi){
                ilkSayi=ikinciSayi;
                ikinciSayi=yeniSayi;
                yeniSayi=ilkSayi+yeniSayi;
                if (sayi>yeniSayi){
                    fibonacci.add(yeniSayi);
                }
            }
        }
        return fibonacci;
    }
}
