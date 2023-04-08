package OrtakCalisma1;

public class C02_Soru2 {
    public static void main(String[] args) {
        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.

        int[] arr1 ={1,2,3,4,5,6,-6,-5,-4,-3,-2,-1};
        System.out.println(arraydanTopla(arr1)); // 21
    }
    public static int arraydanTopla(int[] arr){

        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                toplam=toplam +arr[i];
            }

        }
        return toplam;
    }

}
