/* 使用 Collections 类的 replaceAll() 来替换List中所有的指定元素 */
import java.util.*;

public class ListReplace {
   public static void main(String[] args) {
      List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
      System.out.println("List :"+list);
      Collections.replaceAll(list, "one", "hundrea");
      System.out.println("replaceAll: " + list);
   }
}
