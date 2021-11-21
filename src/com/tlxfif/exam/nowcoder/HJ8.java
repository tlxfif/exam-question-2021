package com.tlxfif.exam.nowcoder;

import java.util.*;

/**
 * start 2021-11-20 18:21
 * end 2021-11-20 18:35
 */
public class HJ8 implements Comparator{
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            Integer key = in.nextInt();
            Integer value = in.nextInt();
            if(map.containsKey(key)){
                value = map.get(key) + value;
            }
            map.put(key,value);
        }
        List<Integer> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            arr.add(item.getKey());
        }
        arr.sort(new HJ8());
        for (Integer integer : arr) {
            System.out.println(integer+" "+map.get(integer));
        }
    }

    @Override
    public int compare(Object o1, Object o2) {
        Integer i = (Integer)o1;
        Integer j = (Integer)o2;
        if(i>j){
            return 1;
        }else if(i<j){
            return -1;
        }
        return 0;
    }
}
