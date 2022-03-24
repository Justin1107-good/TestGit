package com.test.oprator;

public class OpratorTest3 {
    public static void main(String[] args) {
        //自增自减运算符 ++ 、--
        int a =10;
       // a++;//a=a+1
        ++a;
        System.out.println(a);

        int b =10;
        //b--;
        --b;
        System.out.println(b);

        System.out.println("--------------------------------------------------");
        //在表达式中不是单独操作下 ++、--的区别
        //++\--在前 先+1、-1
        int i = 10;
        int j =++i;
        System.out.println(j);
        System.out.println(i);
        System.out.println("--------------------------------------------------");
        //++\--后 先+1、-1
        int m =10;
        int n = m++;
        System.out.println(m);//11
        System.out.println(n);//10

        /**
         * 区别：单独使用没有区别
         * 非单独使用：在变量前，先进行变量计算在使用变量
         * 非单独使用：在变量后，先使用变量，再做计算
         * */
    }
}
