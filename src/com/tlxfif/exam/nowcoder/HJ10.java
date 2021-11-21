package com.tlxfif.exam.nowcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * start 2021-11-21 15:45
 * end 2021-11-21 15:51
 */
public class HJ10 {
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        String next = in.next();
        char[] arr = next.toCharArray();
        Map<Character,Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                if((arr[i]+"").hashCode()>=0&&(arr[i]+"").hashCode()<=127){
                    map.put(arr[i],true);
                }
            }
        }
        System.out.println(map.keySet().size());
    }

}

