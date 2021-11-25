package com.tlxfif.exam.nowcoder;

import java.util.ArrayList;

/*
 * start 2011-11-26 00:09
 * end 2011-11-26 00:26
 */
public class JZ59 {
    public static void main(String[] args) {
        int [] num = {9,10,9,-7,-3,8,2,-6};
        int size = 5;

//        int [] num = {2,3,4,2,6,2,5,1};
//        int size = 3;

        ArrayList<Integer>  list = maxInWindows(num,size);
        System.out.println(list);
    }



    public static ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer>  list= new ArrayList<>();
        if(size==0){
            return list;
        }
        int left = 0;
        int right = size;
        while (right<=num.length){
            int max = num[left];
            for (int i = left; i < right; i++) {
                    if(max<num[i]){
                        max = num[i];
                    }
            }
            left++;
            right++;
            list.add(max);
        }
        return list;
    }
}
