package Important1;

import enity.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 两个链表的第一个公共节点
 * <p>
 * 输入两个链表，找出它们的第一个公共结点
 */
public class P253_CommonNodesInLists {
    /**
     * 已过牛客
     * https://www.nowcoder.com/practice/6ab1d9a29e88450685099d45c9e31e46?tpId=13&tqId=11189&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
     *
     * @param pHead1
     * @param pHead2
     * @return
     */
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Set<ListNode> hashSet = new HashSet();
        ListNode current1 = pHead1;
        ListNode current2 = pHead2;
        while (current1 != null) {
            hashSet.add(current1);
            current1 = current1.next;
        }
        while (current2 != null) {
            if (!hashSet.add(current2)) {
                return current2;
            }
            current2 = current2.next;
        }
        return null;

    }
}
