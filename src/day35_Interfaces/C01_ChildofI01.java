package day35_Interfaces;

import day32_inheritance_dataTypeKullanimi.CAvciKuslar;

public class C01_ChildofI01 extends CAvciKuslar implements I01_Interface {


    @Override
    public void toplama() {

    }

    @Override
    public void cikarma() {

    }

    @Override
    public String ekleme() {
        return null;
    }

    @Override
    public int faktoriyel()  {

        return 0;
    }

    public static void main(String[] args) {

        System.out.println(I01_Interface.str);
    }
}
