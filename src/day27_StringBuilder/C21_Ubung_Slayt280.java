package day27_StringBuilder;

import java.util.SortedMap;

public class C21_Ubung_Slayt280 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb);


        System.out.println("=============== Slayt 281");
        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
        if (s1==s2.toString())System.out.println("1");  // toString()  ile hatayi kapattim
        if(s1.equals(s2))System.out.println("2");

        System.out.println("=========================== Slayt 282");

        String numbers="012345678";
        System.out.println(numbers.substring(1,3));
        System.out.println(numbers.substring(7,7));
        System.out.println(numbers.substring(7));

        System.out.println("=========================== Slayt 283");

        int total =0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1,2).length();
        total += letters.substring(6,6).length();
        total += letters.substring(6,5).length();
        System.out.println(total);

    }
}
