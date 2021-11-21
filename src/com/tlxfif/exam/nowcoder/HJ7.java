package com.tlxfif.exam.nowcoder;

import java.util.Scanner;

/**
 * start 2021-11-20 18:16
 * end 2021-11-20 18:20
 */
public class HJ7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        int pre = (int) a;
        if(a-pre>=0.5){
            pre+=1;
        }
        System.out.println(pre);
    }
}
