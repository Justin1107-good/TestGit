package com.test.oprator;

import jdk.swing.interop.SwingInterOpUtils;

public class OpratorTest2 {
    public static void main(String[] args) {
        //+为连接符
        int a = 5;
        System.out.println("abc"+'a');//abca
        System.out.println(a+'a'); //102
        System.out.println("abc"+a+'a');//abc5a
        System.out.println("abc"+(a+'a'));//abc102
        System.out.println("abc"+" "+a); //abc 5

    }
}
