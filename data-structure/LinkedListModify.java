//以下实例演示了使用 add() 和 set() 方法来修改链接中的元素
import java.util.LinkedList;
 
public class LinkedListModify {
   public static void main(String[] a) {
      LinkedList l = new LinkedList();
      l.add("B");
      l.add("T");
      l.add("H");
      l.add("P");
	  
      System.out.println(l);
      l.set(2, "M");
      System.out.println(l);
   }
}
