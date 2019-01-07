package RightSolution;

import enity.TreeNode;

/**
 * 平衡二叉树
 *
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class P273_isBalanced {
    /**
     * 已过牛客
     * <p>
     * https://www.nowcoder.com/practice/8b3b95850edb4115918ecebdf1b4d222?tpId=13&tqId=11192&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
     *
     * @param root
     * @return
     */
    private boolean isBalanced = true;

    public boolean IsBalanced_Solution(TreeNode root) {
        getHeight(root);
        return isBalanced;
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if (Math.abs(left - right) > 1) {
            isBalanced = false;
        }
        return Math.max(left, right) + 1;
    }
}
