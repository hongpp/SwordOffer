package RightSolution;

import enity.TreeNode;

/**
 * 树的子结构
 *
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class P148_SubstructureInTree {
    /**
     * 已过牛客
     *
     * https://www.nowcoder.com/practice/6e196c44c7004d15b1610b9afca8bd88?tpId=13&tqId=11170&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
     * @param root1
     * @param root2
     * @return
     */
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root2 == null) {
            return false;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            if (tree1HasTree2FromRoot(root1, root2)) {
                return true;
            }
        }
        return HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }

    public static boolean tree1HasTree2FromRoot(TreeNode root1, TreeNode root2){
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val == root2.val && tree1HasTree2FromRoot(root1.left, root2.left) && tree1HasTree2FromRoot(root1.right, root2.right)) {
            return true;
        } else {
            return false;
        }
    }

}
