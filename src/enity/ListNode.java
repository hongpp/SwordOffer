package enity;

public class ListNode<T> {
    public T val;
    public ListNode<T> next;

    public ListNode(T val) {
        this.val = val;
        this.next = null;
    }

    @Override
    public String toString() {
        return "enity.ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
