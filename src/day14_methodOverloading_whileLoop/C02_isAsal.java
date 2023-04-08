package day14_methodOverloading_whileLoop;

public class C02_isAsal {
    public static void main(String[] args) {
        // Verilen birden büyük bir tamsayi icin
        // sayi asal ise true
        // sayi asal degil ise false dönen bir method olusturun

        System.out.println(isAsal(20)); // false
        System.out.println(isAsal(43)); // true
        boolean sonuc=isAsal(57); // sonuc variable'ina false degeri atar
        System.out.println(isAsal(5)); //true
    }

    public static boolean isAsal(int sayi){
        int flag=0;

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                flag++;
                break;
            }
        }
        if (sayi==2){
            return true;
        }
        if (flag==0){
            return true;
        }else {
            return false;
        }
    }
}
