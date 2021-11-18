package com.tlxfif.exam.nowcoder;

import java.util.Scanner;

/*
 * start 2011-11-18 23:38
 * end 2011-11-18 23:57
 */
public class HJ86 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            String str = Integer.toBinaryString(in.nextInt());
            int count = 0;
            int max = 0;
            char [] c = str.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if(c[i]=='1'){
                    count++;
                }
                if(c[i]=='0'||i==c.length-1){
                    if(max<count){
                        max = count;
                    }
                    count= 0;
                }
            }
            System.out.println(max);
        }
    }
}
