package com.tlxfif.exam.nowcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * start 2021-11-21 15:36
 * end 2021-11-21 15:43
 */
public class HJ9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char [] arr = str.toCharArray();
        Map<Character,Boolean> map= new HashMap<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if(!map.containsKey(arr[i])) {
                System.out.print(arr[i]);
                map.put(arr[i],true);
            }
        }
    }
}
