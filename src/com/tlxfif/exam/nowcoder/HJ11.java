package com.tlxfif.exam.nowcoder;

import java.util.Scanner;

/**
 * start 2021-11-21 15:52
 * end 2021-11-21 15:54
 */
public class HJ11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        char [] arr = a.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
