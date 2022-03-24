package com.test.oprator;

public class OpratorTest1 {
    public static void main(String[] args) {
        //拆分3位数 个，十位，百位 输出
        int data = 365;
        int ge=data%10;
        System.out.println(ge);
        int shi = data /10%10;
        System.out.println(shi);
        int bai = data/100;
        System.out.println(bai);
    }
}
