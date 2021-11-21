package com.tlxfif.exam.nowcoder;

import java.util.*;

/**
 * start 2021-11-20 16:48
 * end 2021-11-20 17:02
 */
public class HJ3 implements Comparator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int count = in.nextInt();
            Set<Integer> set = new HashSet<>();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                set.add(in.nextInt());
            }
            for (Integer integer : set) {
                list.add(integer);
            }
            list.sort(new HJ3());
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
    }

    @Override
    public int compare(Object o1, Object o2) {
        Integer i = (Integer)o1;
        Integer j = (Integer)o2;
        if(i>j){
            return 1;
        }else if(j>1){
            return -1;
        }
        return 0;
    }
}
