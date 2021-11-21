package com.tlxfif.exam.nowcoder;
import java.util.Scanner;

/**
 * start 2021-11-20 16:42
 * end 2021-11-20 16:47
 */

public class HJ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        a = a.toLowerCase();
        b = b.toLowerCase();
        String c = a.replaceAll(b,"");
        System.out.println(a.length() -c.length());
    }
}