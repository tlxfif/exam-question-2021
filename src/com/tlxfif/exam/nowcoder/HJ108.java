package com.tlxfif.exam.nowcoder;

import java.util.Scanner;

/*
 * start 2011-11-18 23:58
 * end 2011-11-19 00:31
 */
public class HJ108 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            if(a%b==0){
                System.out.println(a);return;
            }
            if(b%a==0){
                System.out.println(b);return;
            }
            int i = getMaxCommonDivisor(a,b);
            if(i==1){
                System.out.println(a*b);return;
            }
            System.out.println(getMinCommonMultiple(a,b,1));
        }
    }

    public static int getMinCommonMultiple(int a,int b,int ji){
        int i = getMaxCommonDivisor(a,b);
        ji = ji*i;
        if(i==1){
            return a*b*ji;
        }
        int cNumber = getMaxCommonDivisor(a/i,b/i);
        ji = cNumber *ji;
        if(cNumber==1){
            return a/i*b/i*ji;
        }
        return getMinCommonMultiple(a/i,b/i,ji);
    }
    public static int getMaxCommonDivisor(int a,int b){
        if(a==b){
            return 1;
        }
        int left=a,right=b;
        if(a>b){
            right = a;
            left = b;
        }
        int maxNum = 0;
        for (int i = 1; i <= left; i++) {
            if(left%i==0 && right%i==0){
                if(maxNum<i){
                    maxNum = i;
                }
            }
        }
        return maxNum;
    }
}
