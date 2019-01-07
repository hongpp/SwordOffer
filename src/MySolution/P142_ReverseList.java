package MySolution;

import enity.ListNode;

/**
 * 反转链表
 * <p>
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class P142_ReverseList {
    /**
     * 已过牛客
     * <p>
     * https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?tpId=13&tqId=11168&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
     *
     * @param head
     * @return
     */
    public static ListNode ReverseList(ListNode head) {
        if (head == null && head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode post = head.next;
        while (true) {
            cur.next = pre;
            pre = cur;
            cur = post;
            if (post != null) {
                post = post.next;
            } else {
                return pre;
            }

        }
    }
}
