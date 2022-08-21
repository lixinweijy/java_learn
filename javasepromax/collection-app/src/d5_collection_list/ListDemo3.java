package d5_collection_list;

import java.util.LinkedList;

/**
 * ArrayList底层是基于数组实现的
 *第一次创建集合并添加第一个元素的时候，在底层创建一个默认长度为10的数组
 * 超过10是会增加长度，1.5倍增加
 *
 *
 * LinkedList底层是基于双链表的
 * 首位操作速度快
 */

public class ListDemo3 {
    public static void main(String[] args) {
        //LinkedList 可以完成队列结构和栈结构
        //栈
        LinkedList<String> stack=new LinkedList<>();
        //入栈
        stack.addFirst("1");//push也一样
        stack.addFirst("2");
        stack.addFirst("3");
        System.out.println(stack);
        //出栈
        System.out.println(stack.removeFirst());//pop
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack);

        System.out.println("--------------------");
        //队列
        LinkedList<String> queue=new LinkedList<>();
        queue.addLast("1");//offlast
        queue.addLast("2");
        queue.addLast("3");
        System.out.println(queue);

        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);
    }
}
