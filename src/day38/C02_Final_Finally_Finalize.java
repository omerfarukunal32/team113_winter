package day38;

public class C02_Final_Finally_Finalize {

    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE); // -2147483648

        // Integer.MIN_VALUE=3;    Constant Data

        System.out.println(Math.PI);  // -2147483648    public static final double PI
        // final keyword bir variable'in degerinin degismesini istemiyorsak kullaniriz


        try {
            System.out.println(10/0); // /5 icin de deneme yaptik
            System.out.println("Bolmenin sonrasindaki satir");
        }catch (Exception e){
            System.out.println("catch blogundaki satir");
        }finally {
            System.out.println("finally blogundaki satir");
        }
    }
}
