package com.tlxfif.exam.nowcoder;

import java.util.Scanner;
/**
 * start 2021-11-23 21:16
 * end 2021-11-21 21:19
 */

public class HJ13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] arr = str.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if(i != 0){
                System.out.print(" ");
            }
        }
    }
}