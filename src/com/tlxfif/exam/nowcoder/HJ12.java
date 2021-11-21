package com.tlxfif.exam.nowcoder;
import java.util.Scanner;


/**
 * start 2021-11-21 15：55
 * end 2021-11-21
 */
public class HJ12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        char [] arr = a.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}