/* 遍历从Collection接口延伸出的List、Set和以键值对形式作存储的Map类型的集合，以下我们分别使用了普通for，增强型的 for ，iterator 等方式来遍历集合 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionTraverse {

   public static void main(String[] args) {
      // List集合的遍历
      listTest();
      // Set集合的遍历
      setTest();
   }

   private static void setTest() {
      Set<String> set = new HashSet<String>();
      set.add("JAVA");
      set.add("C");
      set.add("C++");
      // 重复数据添加失败
      set.add("JAVA");
      set.add("JAVASCRIPT");

      // 使用iterator遍历set集合
      Iterator<String> it = set.iterator();
      while (it.hasNext()) {
         String value = it.next();
         System.out.println(value);
      }

      // 使用增强for循环遍历set集合
      for(String s: set){
         System.out.println(s);
      }
   }

   // 遍历list集合
   private static void listTest() {
      List<String> list = new ArrayList<String>();
      list.add("菜");
      list.add("鸟");
      list.add("教");
      list.add("程");
      list.add("www.runoob.com");

      // 使用iterator遍历
      Iterator<String> it = list.iterator();
      while (it.hasNext()) {
         String value = it.next();
         System.out.println(value);
      }

      // 使用传统for循环进行遍历
      for (int i = 0, size = list.size(); i < size; i++) {
         String value = list.get(i);
         System.out.println(value);
      }

      // 使用增强for循环进行遍历
      for (String value : list) {
         System.out.println(value);
      }
   }
}
