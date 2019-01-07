package MySolution;

import enity.ListNode;

import java.util.HashSet;

/**
 * 删除链表中重复的节点
 * <p>
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class P122_deleteDuplicatedNode {
    public static ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        if (pHead.val == pHead.next.val) {
            ListNode next = pHead.next;
            while (next != null && next.val == pHead.val) {
                next = next.next;
            }
            return deleteDuplication(next);
        }
        pHead.next = deleteDuplication(pHead.next);
        return pHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        System.out.println(deleteDuplication(head));
    }


}
