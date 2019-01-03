package MySolution;

import enity.ListNode;

import java.util.ArrayList;

/**
 * 从尾到头打印链表
 */

public class P58_PrintListInReversedOrder {
    static ArrayList<Integer> list = new ArrayList<>();
    /**
     * 已过牛客
     * https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
     *
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode<Integer> listNode) {
        if (listNode != null) {
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode<Integer> head = new ListNode<>(1);
        head.next = new ListNode<>(2);
        head.next.next = new ListNode<>(3);
        System.out.println(printListFromTailToHead(head));
    }

}