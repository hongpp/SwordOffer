package enity;

public class TreeNode<T> {
    public T val;
    public TreeNode<T> left;
    public TreeNode<T> right;
    public TreeNode<T> next;

    public TreeNode(T val) {
        this.val = val;
        this.left = null;
        this.right = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return "enity.TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
