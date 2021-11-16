package com.tlxfif.exam.nowcoder;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * start 2021-11-17 00:13
 * end 2021-11-17 03:11
 */
public class HJ18 {

    static class Addr {
        private Integer index;
        private Long start;
        private Long end;

        public Addr(Integer index, Long start, Long end) {
            this.index = index;
            this.start = start;
            this.end = end;
        }
    }
    public static List<Addr> iPAddr =new ArrayList<>();
    static {
        iPAddr.add(new Addr(0,1000000000L,126255255255L));
        iPAddr.add(new Addr(1,128000000000L,191255255255L));
        iPAddr.add(new Addr(2,192000000000L,223255255255L));
        iPAddr.add(new Addr(3,224000000000L,239255255255L));
        iPAddr.add(new Addr(4,240000000000L,255255255255L));

        iPAddr.add(new Addr(6,10000000000L,10255255255L));
        iPAddr.add(new Addr(6,172016000000L,172031255255L));
        iPAddr.add(new Addr(6,192168000000L,192168255255L));
    }

    public static boolean countIp(long ip,int[] arr,boolean trueAdd){
        boolean isAdd = false;
        System.out.println(ip);
        for (Addr addr : iPAddr) {
            if(ip>=addr.start&&ip<=addr.end){
                if(trueAdd){
                    arr[addr.index] +=1;
                }
                isAdd = true;
            }
        }
        return isAdd;
    }

    private static String full0(Integer num){
        if(num<=9){
            return "00"+num;
        }
        if(num<=99){
            return "0"+num;
        }
        return ""+num;
    }

    public static Long covertIP(String str){
        String[] item = str.split("\\.");
        if (item.length!=4) {
            return null;
        }
        String ip = "";
        for (int i = 0; i < item.length; i++) {
            try {
                int num = Integer.parseInt(item[i]);
                if(num<0||num>255){
                    //非法ip
                    return null;
                }
                ip+=full0(num);
            }catch (NumberFormatException e){
                e.printStackTrace();
                return null;
            }
        }
        return Long.valueOf(ip);
    }

    public static boolean checkMaskErrorBackT(String str){
        String[] item = str.split("\\.");
        if (item.length!=4) {
            return true;
        }
        String ip = "";
        for (int i = 0; i < item.length; i++) {
            try {
                int num = Integer.parseInt(item[i]);
                if(num<0||num>255){
                    //非法ip
                    return true;
                }
                String h = Long.toBinaryString(num);

                if(h.length()<8){
                    for(int c = 0;c<(8-h.length());c++){
                        ip+="0";
                    }
                }
                ip+=h;
            }catch (NumberFormatException e){
                e.printStackTrace();
                return true;
            }
        }
        if(!ip.contains("0") || !ip.contains("1")){
            return true;
        }
        return ip.contains("01");
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //统计A、B、C、D、E、错误IP地址或错误掩码、私有IP的个数，之间以空格隔开。
        int[] arr = {0,0,0,0,0,0,0};

        while (in.hasNext()) {
            String line = in.nextLine();
            String[] addr = line.split("~");
            if(addr.length!=2){
                return;
            }
            Long ip = covertIP(addr[0]);
            Long mask = covertIP(addr[1]);
            if(ip==null || mask ==null){
                arr[5]+=1;
            }else{
                if(countIp(ip,arr,false) && checkMaskErrorBackT(addr[1])){
                    arr[5]+=1;
                }else{
                    countIp(ip,arr,true);
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if(i!=arr.length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}