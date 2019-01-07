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
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        HashSet hs = new HashSet();
        while (pHead1 != null) {
            hs.add(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null) {
            if (!hs.add(pHead2)) {
                return pHead2;
            }
            pHead2 = pHead2.next;
        }
        return null;
    }
}
