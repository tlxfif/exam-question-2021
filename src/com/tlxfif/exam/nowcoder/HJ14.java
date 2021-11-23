package com.tlxfif.exam.nowcoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
 * start 2021-11-23 21:20
 * end 2021-11-21 21:24
 */
public class HJ14 implements Comparator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        List<String> list = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            list.add(in.next());
        }
        list.sort(new HJ14());
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Override
    public int compare(Object o1, Object o2) {
        String a = (String) o1;
        String b = (String) o2;
        return a.compareTo(b);
    }
}
