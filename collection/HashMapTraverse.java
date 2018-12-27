/* 使用 Collection 类的 iterator() 方法来遍历集合 */

import java.util.*;

public class HashMapTraverse {
   public static void main(String[] args) {
      HashMap< String, String> hMap = new HashMap< String, String>();
      hMap.put("1", "1st");
      hMap.put("2", "2nd");
      hMap.put("3", "3rd");
      Collection cl = hMap.values();
      Iterator itr = cl.iterator();
      while (itr.hasNext()) {
         System.out.println(itr.next());
     }
   }
}
