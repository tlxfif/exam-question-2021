package com.tlxfif.exam.nowcoder;

import java.util.Scanner;

/**
 * start 2021-11-20 17:03
 * end 2021-11-20 17:11
 */
public class HJ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String next = in.next();
            printFull(next);
        }
    }
    public static void printFull(String str){
        if(str.length()>8){
            String tmp = str.substring(0,8);
            full0(tmp);
            printFull(str.substring(8));
        }else{
            full0(str);
        }
    }
    public static void full0(String str){
        int len = str.length();
        if(len==8){
            System.out.println(str);
            return;
        }
        int count = 8-len;
        System.out.print(str);
        for (int i = 0; i <count; i++) {
            System.out.print("0");
        }
        System.out.println();
    }
}
