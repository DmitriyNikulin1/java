import java.util.Arrays;
import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:

public class task2 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>(Arrays.asList("hello", "world", 43, 4));
        System.out.println(list);

        System.out.println("enqueue:");
        System.out.println(enqueue(list, "hi"));
        System.out.println();

        System.out.println("dequeue:");
        System.out.println(dequeue(list));
        System.out.println();

        System.out.println("first:");
        System.out.println(first(list));

    }
    public static Object enqueue(LinkedList<Object> list, Object element) {
        return list.offer(element);
    }
    public static Object dequeue(LinkedList<Object> list) {
        return list.poll();
    }
    public static Object first(LinkedList<Object> list) {
        return list.peek();
    }
}