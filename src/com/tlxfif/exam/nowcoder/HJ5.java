package com.tlxfif.exam.nowcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * start 2021-11-20 17:11
 * end 2021-11-20 17:52
 */
public class HJ5 {


    public static Map<Character,Integer> base = new HashMap<>();

    static {
        base.put('0',0);
        base.put('1',1);
        base.put('2',2);
        base.put('3',3);
        base.put('4',4);
        base.put('5',5);
        base.put('6',6);
        base.put('7',7);
        base.put('8',8);
        base.put('9',9);
        base.put('A',10);
        base.put('B',11);
        base.put('C',12);
        base.put('D',13);
        base.put('E',14);
        base.put('F',15);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String a = in.nextLine();
            a = a.substring(2);
            char [] aa = a.toCharArray();
            int sum = 0;
            for (int i = aa.length - 1; i >= 0; i--) {
                Integer num = base.get(aa[i]);
                int temp;
                if(aa.length>1){
                    temp = num * getBitNumber(aa.length-i-1);
                }else{
                    temp = num;
                }
                sum +=temp;
            }
            System.out.println(sum);
        }
    }
    public static int getBitNumber(int i){
        int num = 1;
        for (int j = 0; j < i; j++) {
            num*=16;
        }
        return num;
    }
}
