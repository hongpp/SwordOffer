package MySolution;

import enity.TreeNode;

import java.util.List;

/**
 * 重建二叉树
 * <p>
 * 根据二叉树的前序遍历和中序遍历，重建该二叉树。
 * <p>
 * 思路：以上图为例，前序遍历为12453，中序遍历为42513。前序的第一个数字1表明了树的根节点，结合中序可知，
 * 425为根节点的左子树，3为根节点的右子树。对于左子树部分，它的前序为245，中序为425，继续分而重建。对于左子树也如此。
 */
public class P62_ConstructBinaryTree {
    public static void main(String[] args) {
        //            1
        //          /   \
        //         2     3
        //        / \
        //       4   5
        //pre->12453  in->42513   post->45231
        int[] pre = {1, 2, 4, 5, 3};
        int[] in = {4, 2, 5, 1, 3};
        TreeNode root = reConstructBinaryTree(pre, in);
        //对重建后的树,进行前中后序遍历，验证是否重建正确
        //调用的重建函数见：http://www.jianshu.com/p/362d4ff42ab2
        List<Integer> preorder = P60_TraversalOfBinaryTree.preorderRecursively(root);
        List<Integer> inorder = P60_TraversalOfBinaryTree.inorderRecursively(root);
        List<Integer> postorder = P60_TraversalOfBinaryTree.postorderRecursively(root);
        System.out.println(preorder);
        System.out.println(inorder);
        System.out.println(postorder);
    }

    /**
     * 已知中序 先序
     * 已过牛客
     *https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6?tpId=13&tqId=11157&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
     * @param pre
     * @param in
     * @return
     */
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        TreeNode root = new TreeNode(pre[startPre]);
        for (int i = startIn; i <= endIn; i++) {
            if (in[i] == (int) root.val) {
                root.left = reConstructBinaryTree(pre, startPre + 1, startPre + (i - startIn), in, startIn, i - 1);
                root.right = reConstructBinaryTree(pre, startPre + (i - startIn) + 1, endPre, in, i + 1, endIn);
            }
        }
        return root;
    }


    // todo 已知中序 后序
    public static TreeNode reConstructBinaryTreePost(int[] post, int[] in) {
        TreeNode root = reConstructBinaryTreePost(post, 0, post.length - 1, in, 0, in.length - 1);
        return root;
    }

    public static TreeNode reConstructBinaryTreePost(int[] post, int startPost, int endPost, int[] in, int startIn, int endIn) {
        if (startPost > endPost || startIn > endIn) {
            return null;
        }
        TreeNode root = new TreeNode(post[endPost]);
        return root;
    }

}
