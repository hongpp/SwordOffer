package MySolution;

import java.util.Stack;

/**
 * 用两个栈实现队列
 * <p>
 * 用两个栈，实现队列的从队尾插入元素offer()和从队头抛出元素poll()
 * 相关：用队列实现栈
 * 思路：
 * （1）对于插入操作，栈与队列都是从队尾进行，因此一行代码就可以完成offer()
 * （2）对于弹出操作，队列先进先出从队头开始，而栈后进先出从队尾开始，要想取到队头元素，就得需要第二个栈stack2的协助：
 * 弹出时将stack1的元素依次取出放到stack2中，此时stack2进行弹出的顺序就是整个队列的弹出顺序。而如果需要插入，放到stack1中即可。
 * 总结下，stack1负责插入，stack2负责弹出，如果stack2为空了，将stack1的元素依次弹出并存放到stack2中，之后对stack2进行弹出操作。
 */
public class P68_QueueWithTwoStacks {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        myQueue.push(4);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
    }

}

/**
 * 已过牛客
 * <p>
 * https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6?tpId=13&tqId=11158&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 *
 * @param <T>
 */
class MyQueue<T> {
    private Stack<T> stack1 = new Stack<>();
    private Stack<T> stack2 = new Stack<>();

    public void push(T node) {
        stack1.push(node);
    }

    public T pop() {
        if (stack1.empty() && stack2.empty()) {
            throw new RuntimeException("queue is empty!");
        }
        if (stack2.empty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
