package Important1;

import enity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的遍历
 * <p>
 * 二叉树是一种非常常用的数据结构，也是面试的热门词。而二叉树最常见的考点莫过于遍历，
 */
public class P60_TraversalOfBinaryTree {
    // 前序遍历递归版
    public static List<Integer> preorderRecursively(TreeNode<Integer> node) {
        List<Integer> list = new ArrayList<>();
        if (node == null) {
            return list;
        }
        list.add(node.val);
        list.addAll(preorderRecursively(node.left));
        list.addAll(preorderRecursively(node.right));
        return list;
    }

    // 中序遍历递归版
    public static List<Integer> inorderRecursively(TreeNode<Integer> node) {
        List<Integer> list = new ArrayList<>();
        if (node == null) {
            return list;
        }
        list.addAll(inorderRecursively(node.left));
        list.add(node.val);
        list.addAll(inorderRecursively(node.right));
        return list;

    }

    // 后序遍历递归版
    public static List<Integer> postorderRecursively(TreeNode<Integer> node) {
        List<Integer> list = new ArrayList<>();
        if (node == null) {
            return list;
        }
        list.addAll(postorderRecursively(node.left));
        list.addAll(postorderRecursively(node.right));
        list.add(node.val);
        return list;
    }


    //层序遍历
    public static List<Integer> levelorder(TreeNode<Integer> node) {
        List<Integer> list = new ArrayList<>();
        if (node == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            list.add((Integer) treeNode.val);
            if (treeNode.left != null) {
                queue.offer(treeNode.left);
            } else if (treeNode.right != null) {
                queue.offer(treeNode.right);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        //            1
        //              \
        //               2
        //              /
        //             3
        //pre->123  in->132   post->321  level->123
        TreeNode<Integer> root = new TreeNode<>(1);
        root.right = new TreeNode<>(2);
        root.right.left = new TreeNode<>(3);

        List<Integer> list_preorderRecursively = preorderRecursively(root);
        System.out.print("preorderRecursively: " + '\t');
        System.out.println(list_preorderRecursively.toString());

        List<Integer> list_inorderRecursively = inorderRecursively(root);
        System.out.print("inorderRecursively: " + '\t');
        System.out.println(list_inorderRecursively.toString());

        List<Integer> list_postorderRecursively = postorderRecursively(root);
        System.out.print("postorderRecursively: " + '\t');
        System.out.println(list_postorderRecursively.toString());

        List<Integer> list_levelorder = levelorder(root);
        System.out.print("levelorder: " + '\t');
        System.out.println(list_levelorder.toString());


    }


}
