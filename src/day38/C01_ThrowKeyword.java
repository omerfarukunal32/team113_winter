package day38;

public class C01_ThrowKeyword {
    public static void main(String[] args) {
        // sayi sifirdan kucukse sartli satirlar calismasin
        int sayi=-10;

        try {

            if (sayi<0){
                throw new IllegalArgumentException("Sayi negatif olmamali");
            }

            System.out.println("Sartli calisacak satir 1");
            System.out.println("Sartli calisacak satir 2");
            System.out.println("Sartli calisacak satir 3");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }


        System.out.println("yola devam");
    }
}
