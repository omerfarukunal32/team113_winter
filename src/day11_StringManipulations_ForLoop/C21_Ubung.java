package day11_StringManipulations_ForLoop;

public class C21_Ubung {
    public static void main(String[] args) {

        // 100'den baslayarak 1'e kadar (sinirlar dahil)
        // 7 ile bölünebilen sayilari yazdirin
        //for (int i=100;i>=1;i--){
        //    if(i%7==0){
        //        System.out.print(i+",");
        //    }
        //}

        //========================================

        // 1 den baslayip, 13'ser artarak 1000'e kadar yazdirin
        // (1000 yazdirmamiz gerekiyorsa yazdirin ama 1000' gecmeyin)

        for(int i=1;i<=1000;i++){
            if(i%13==0){
                System.out.print(i+", ");
            }
        }
    }
}
