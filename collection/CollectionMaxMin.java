/* 使用 Collections 类的 max() 和 min() 方法来获取List中最大最小值 */
import java.util.*;

public class CollectionMaxMin {
   public static void main(String[] args) {
      List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
      System.out.println(list);
      System.out.println("最大值: " + Collections.max(list));
      System.out.println("最小值: " + Collections.min(list));
   }
}
