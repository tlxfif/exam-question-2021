package com.tlxfif.exam.nowcoder;

import java.util.Scanner;

public class HJ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        if (in.hasNext()) { // 注意 while 处理多个 case
            String strs = in.nextLine();
            String[] arr =  strs.split(" ");
            System.out.println(arr[arr.length-1].length());
        }
    }
}