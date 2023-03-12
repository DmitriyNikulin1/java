import java.util.Arrays;
import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

public class task1 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>(Arrays.asList("hello", "world", 43, 4));
        System.out.println(list);
        System.out.println(reverseList(list));
    }
    public static Object reverseList(LinkedList<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(list.size() - i, list.get(0));
            list.remove();
        }

        return list;
    }
}