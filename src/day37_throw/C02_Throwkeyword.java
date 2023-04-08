package day37_throw;

public class C02_Throwkeyword {
    /*
        1- Throw Keyvord : Kodlarimizi calistirirken, belli sartlar altinda, belirli bolumlerini
        ignore edilmesini istersek, o sart saglandiginda kontrollu olarak
     */
    public static void main(String[] args) {
        String a=null;
        String b="";

        try {
        try {
            int c = a.length()+b.length(); // burada NullPointerException yakaladi ve
                                            // NPE buluncaya kadar aradakiler ignore ediir

        }catch (NullPointerException e){
            if (b.length()==0){
                throw new RuntimeException(); // RuntimeException bulana kadar her satir ignore edilir
            }
            System.out.println("null Pointer'dir, uzunlugu olmaz");
        }
        }catch (RuntimeException e){
            System.out.println("throw keyword");
        }
    }
}
