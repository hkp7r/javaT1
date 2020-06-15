package com.wzy.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class HelloWorld {

    //prsf
    private static final String str = "stringXXX";

    //psf
    public static final String strw = "sf";

    //psfi
    public static final int age = 10;

    //psfs
    public static final String stra = "stra";


    //psvm
    public static void main(String[] args) {
        System.out.println("hello world !");
        //sout
        System.out.println();
        //soutp
        System.out.println("args = " + Arrays.deepToString(args));
        //soutm
        System.out.println("HelloWorld.main");
        //soutv
        System.out.println("args = " + args);
        int a = 10;
        //soutv
        System.out.println("a = " + a);
        //xxx.sout
        System.out.println(a);

        //fori
        for (int i = 0; i < 10; i++) {

        }

        String[] name = new String[]{"name1", "name2", "name3"};
        //iter
        for (String s : name) {

        }

        //itar
        for (int i = 0; i < name.length; i++) {
            String s = name[i];

        }

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("123");
        strings.add("456");
        strings.add("789");

        //strings.for
        for (String s : strings) {

        }
        //strings.fori
        for (int i = 0; i < strings.size(); i++) {

        }
        //strings.forr
        for (int i = strings.size() - 1; i >= 0; i--) {

        }

        //ifn
        if (strings == null) {

        }

        //inn
        if (strings != null) {

        }

        //string.nn
        if (strings != null) {

        }

        //string.null
        if (strings == null) {

        }

    }

    public void My() {
        ArrayList arr = new ArrayList<String>();
        arr.add("123");
        arr.add("DDDD");

        Date date = new Date();
    }

}
