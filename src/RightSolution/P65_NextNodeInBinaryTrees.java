package RightSolution;

import enity.TreeNode;

/**
 * 二叉树的下一个节点
 * <p>
 * 给定二叉树和其中一个节点，找到中序遍历序列的下一个节点。树中的节点除了有左右孩子指针，还有一个指向父节点的指针。
 * <p>
 * 思路：
 * （1）如果输入的当前节点有右孩子，则它的下一个节点即为该右孩子为根节点的子树的最左边的节点，比如2->5,1->3
 * （2）如果输入的当前节点没有右孩子，就需要判断其与自身父节点的关系：
 * （2.1）如果当前节点没有父节点，那所求的下一个节点不存在，返回null.
 * （2.2）如果输入节点是他父节点的左孩子，那他的父节点就是所求的下一个节点,比如4->2
 * （2.3）如果输入节点是他父节点的右孩子，那就需要将输入节点的父节点作为新的当前节点，返回到（2）,判断新的当前节点与他自身父节点的关系,比如5->1
 */
public class P65_NextNodeInBinaryTrees {
    public static TreeNode getNext(TreeNode pNode) {
        if (pNode == null) {
            return null;
        }
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        }
        while (pNode.next != null) {
            if (pNode == pNode.next.left) {
                return pNode.next;
            }
            pNode = pNode.next;
        }
        return null;

    }
    public static void main(String[] args) {
        //            1
        //          // \\
        //         2     3
        //       // \\
        //      4     5
        //    inorder->42513
        // result 2 5 1 3 null
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.next = root;
        root.right = new TreeNode(3);
        root.right.next = root;
        root.left.left = new TreeNode(4);
        root.left.left.next = root.left;
        root.left.right = new TreeNode(5);
        root.left.right.next = root.left;

        System.out.println(getNext(root.left.left).val);
        System.out.println(getNext(root.left).val);
        System.out.println(getNext(root.left.right).val);
        System.out.println(getNext(root).val);
        System.out.println(getNext(root.right));
    }
}
