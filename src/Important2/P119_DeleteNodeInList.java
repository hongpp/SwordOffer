package Important2;

import enity.ListNode;

/**
 * 删除链表的节点
 * <p>
 * 在o(1)时间内删除单链表的节点。
 */
public class P119_DeleteNodeInList {
    public static ListNode<Integer> deleteNode(ListNode<Integer> head, ListNode<Integer> node) {
        if (node == head) {
            return head.next;
        } else if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
            return head;
        } else {
            ListNode tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = null;
            return head;
        }
    }



}
