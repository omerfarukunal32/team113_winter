package day12_forLoops;

public class C01_DikkatEdilecekler {
    public static void main(String[] args) {
        for(int i=20;i<10;i++){
            System.out.println(i+" ");
        }
        //for Loop calisti ancak ilk deger icin bitis sarti false verdiginden
        //Loop body'si HIC DEVREYE GIRMEDI

        //===========================================================
        for(int i=0;i<10;i--){
            System.out.println(i+" ");
        }
        // Loop basladiktan sonra artis/azalis yöntemi sebebiyle
        // bitis degerinden uzaklasiyorsa, Loop teorik olarak sonsuza kadar calisir
        // Buna Sonsuz Loop denir

    }
}
