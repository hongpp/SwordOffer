package Important1;

import enity.ListNode;

/**
 * 链表中倒数第k个结点
 * <p>
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class P134_KthNodeFromEnd {
    /**
     * 已过牛客
     * https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a?tpId=13&tqId=11167&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode left = head;
        ListNode right = head;
        for (int i = 1; i < k; i++) {
            right = right.next;
        }
        if (right == null) {
            return null;
        }
        while (right.next != null) {
            left = left.next;
            right = right.next;
        }
        return left;
    }
}
