package com.tlxfif.exam.nowcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * start 2021-11-20 17:54
 * end 2021-11-20 18:14
 */
public class HJ6 {
    public static List<Long> arr = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        rr(number);
        for (Long i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void rr(long number){
        long ret = 0;
        long k = (long)Math.sqrt(number);
        for (long i = 2; i <= k; i++) {
            if(number%i==0){
                arr.add(i);
                ret = number/i;
                break;
            }
        }
        if(ret!=0){
            rr(ret);
        }else{
            arr.add(number);
        }
    }
}
