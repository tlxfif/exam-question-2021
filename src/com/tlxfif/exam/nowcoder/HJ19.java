package com.tlxfif.exam.nowcoder;

import java.util.*;

/*
 * start 2011-11-17 03:14
 * end 2011-11-17 03:49
 */
public class HJ19 {

    public static List<String> record = new ArrayList<>();
    public static Map<String,Integer> nameMap = new HashMap<>();

    public static void recordErr(String name){
        name = genName(name);
        if(!nameMap.containsKey(name)){
            nameMap.put(name,1);
        }else{
            nameMap.put(name,nameMap.get(name)+1);
        }
        for (String s : record) {
            if(s.equals(name)){
                return;
            }
        }
        record.add(name);
    }

    public static String genName(String name){
        int index = name.lastIndexOf("\\")+1;
        name = name.substring(index);
        String [] lines = name.split(" ");
        if(lines[0].length()>16){
            lines[0] = lines[0].substring(lines[0].length()-16);
        }
        return lines[0] + " " + lines[1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String str = in.nextLine();
            recordErr(str);
        }
        List<String> showList = new ArrayList<>();
        int max = 0;
        if(record.size() - 1 - 7>=0){
            max = record.size() - 1 - 7;
        }
        for (int i = record.size() - 1; i >= max; i--) {
            String item = record.get(i);
            showList.add(item+" "+nameMap.get(item));
        }
        for (int i = showList.size() - 1; i >= 0; i--) {
            System.out.println(showList.get(i));
        }
    }
}
