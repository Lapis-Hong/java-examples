//以下实例演示了如何使用 LinkedList 类的 addFirst() 和 addLast() 方法在链表的开头和结尾添加元素，getFirst()和getLast() 来获取链表的第一个和最后一个元素

import java.util.LinkedList;

public class LinkedListOptions {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");
        System.out.println(l);
        l.addFirst("0");
        System.out.println(l);
        l.addLast("5");
        System.out.println(l);

		System.out.println("链表的第一个元素是：" + l.getFirst());
        System.out.println("链表的最后一个元素是：" + l.getLast());
		
		l.subList(2, 4).clear();
        System.out.println(l);

		l.removeFirst();
		System.out.println(l);

		System.out.println("元素 2 第一次出现的位置：" + l.indexOf("2"));
        System.out.println("元素 2 最后一次出现的位置："+ l.lastIndexOf("2"));
   }
	
}
