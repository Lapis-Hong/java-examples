/* 使用 Java Util 类的 tMap.keySet(),tMap.values() 和 tMap.firstKey() 方法将集合元素输出 */
import java.util.*;

public class CollectionMapOutput{
   public static void main(String[] args) {
      TreeMap tMap = new TreeMap();
      tMap.put(1, "Sunday");
      tMap.put(2, "Monday");
      tMap.put(3, "Tuesday");
      tMap.put(4, "Wednesday");
      tMap.put(5, "Thursday");
      tMap.put(6, "Friday");
      tMap.put(7, "Saturday");
      System.out.println("TreeMap 键："
      + tMap.keySet());
      System.out.println("TreeMap 值："
      + tMap.values());
      System.out.println("键为 5 的值为: " + tMap.get(5)+ "\n");
      System.out.println("第一个键: " + tMap.firstKey()
      + " Value: "
      + tMap.get(tMap.firstKey()) + "\n");
      System.out.println("最后一个键: " + tMap.lastKey()
      + " Value: "+ tMap.get(tMap.lastKey()) + "\n");
      System.out.println("移除第一个数据: "
      + tMap.remove(tMap.firstKey()));
      System.out.println("现在 TreeMap 包含: "
      + tMap.values() + "\n");
   }
}
