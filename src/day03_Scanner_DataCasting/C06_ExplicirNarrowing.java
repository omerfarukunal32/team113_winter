package day03_Scanner_DataCasting;

public class C06_ExplicirNarrowing {
    public static void main(String[] args) {

        double db1= 45.32;

        int in1=(int)db1;  // int<===double  (veri kaybi olabilir)

        System.out.println(in1);  //45 , ondalikli kismi atti

        db1= 3945897456d;

        in1=(int)db1;

        System.out.println(in1); // 2147483647


        in1=34;

        byte by1=(byte)in1;

        System.out.println(by1); //34

        in1=130;

        by1=(byte)in1;

        System.out.println(by1);  // - 126
    }
}
