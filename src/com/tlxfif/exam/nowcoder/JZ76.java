package com.tlxfif.exam.nowcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * start 2011-11-25 0:11
 * end 2011-11-25 0:56
 */
public class JZ76 {

    public static void main(String[] args) {
        JZ76 s = new JZ76();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
//        while (a!=null){
//            System.out.println(a.val);
//            a =  a.next;
//        }
        ListNode listNode = s.deleteDuplication(a);
        System.out.println("========");
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode =  listNode.next;
        }
    }

    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null){
            return pHead;
        }

        ListNode currHead = pHead;
        List<ListNode> list = new ArrayList<>();
        Map<Integer,Boolean> map = new HashMap<>();
        while (currHead!=null){
            if(!map.containsKey(currHead.val)){
                list.add(currHead);
                map.put(currHead.val,true);
            }else{
                map.put(currHead.val,false);
            }
            currHead = currHead.next;
        }
        ListNode allowHead  = null;
        ListNode firstHead = allowHead;
        for (int i = 0; i < list.size(); i++) {
            if (map.get(list.get(i).val)){
                if(allowHead ==null){
                    allowHead = new ListNode(list.get(i).val);
                    firstHead = allowHead;
                }else{
                    allowHead.next = new ListNode(list.get(i).val);
                    allowHead = allowHead.next;
                }
            }
        }
        return firstHead;
    }



    public static class ListNode {
    int val;
    ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
