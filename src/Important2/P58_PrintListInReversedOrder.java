package Important2;

import enity.ListNode;

import java.util.ArrayList;

/**
 * 从尾到头打印链表
 */

public class P58_PrintListInReversedOrder {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        ListNode<Integer> head = new ListNode<>(1);
        head.next = new ListNode<>(2);
        head.next.next = new ListNode<>(3);
        System.out.println(printReversinglyRecursively(head));
    }

    //递归版
//    public static void printReversinglyRecursively(enity.ListNode<Integer> listNode) {
//        if (listNode != null) {
//            printReversinglyRecursively(listNode.next);
//            System.out.println(listNode.val);
//        }
//    }
    //递归版
    public static ArrayList<Integer> printReversinglyRecursively(ListNode<Integer> listNode) {
        if (listNode != null) {
            printReversinglyRecursively(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }

}