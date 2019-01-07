package enity;

public class MyLinkedList<T> {
    class Node<T> {
        T data;
        Node next = null;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public int getLength() {
        return size;
    }

    //通过索引获取节点
    public Node getNodeByIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("索引越界");
        }
        Node node = head;
        for (int i = 0; i < size; i++, node = node.next) {
            if (i == index) {
                return node;
            }
        }
        return null;
    }

    // 头插入
    public void addAtHead(T element) {
        head = new Node<>(element, head);
        if (tail == null) {
            tail = head;
        }
        size++;

    }

    // 尾插入
    public void addAtTail(T element) {
        Node node = new Node(element);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // 删除
    public void delete(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("索引越界");
        }
        Node node = getNodeByIndex(index);
        int flag = index - 1;
        if (flag < 0) {
            head = head.next;
            node = null;
            size--;
            return;
        }


    }


}
