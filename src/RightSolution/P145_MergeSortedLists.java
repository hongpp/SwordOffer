package RightSolution;

import enity.ListNode;

/**
 * 合并两个排序的链表
 * <p>
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class P145_MergeSortedLists {
    /**
     * 已过牛客
     * <p>
     * https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337?tpId=13&tqId=11169&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
     *
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if ((int) list1.val < (int) list2.val) {
            ListNode headNode = list1;
            headNode.next = Merge(list1.next, list2);
            return headNode;
        } else {
            ListNode headNode = list2;
            headNode.next = Merge(list2.next, list1);
            return headNode;
        }
    }
}
