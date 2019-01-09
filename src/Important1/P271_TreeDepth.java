package Important1;

import enity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class P271_TreeDepth {
    private boolean isBalanced = true;

    /**
     * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
     * 已过牛客
     * <p>
     * https://www.nowcoder.com/practice/8b3b95850edb4115918ecebdf1b4d222?tpId=13&tqId=11192&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
     *
     * @param root
     * @return
     */
    public boolean IsBalanced_Solution(TreeNode root) {
        TreeDepth(root);
        return isBalanced;
    }

    /**
     * 已过牛客
     * <p>
     * https://www.nowcoder.com/practice/435fb86331474282a3499955f0a41e8b?tpId=13&tqId=11191&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
     *
     * @param root
     * @return
     */
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        if (Math.abs(left - right) > 1) {
            isBalanced = false;
        }
        return Math.max(left, right) + 1;
    }

}
