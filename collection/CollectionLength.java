/* 使用 Collections 类 的collection.add() 来添加数据并使用 collection.size()来计算集合的长度 */
import java.util.*;

public class CollectionLength {
   public static void main(String [] args) {
      System.out.println( "集合实例!\n" );
      int size;
      HashSet collection = new HashSet ();
      String str1 = "Yellow", str2 = "White", str3 =
      "Green", str4 = "Blue";
      Iterator iterator;
      collection.add(str1);
      collection.add(str2);
      collection.add(str3);
      collection.add(str4);
      System.out.print("集合数据: ");
      iterator = collection.iterator();
      while (iterator.hasNext()){
         System.out.print(iterator.next() + " ");
      }
      System.out.println();
      size = collection.size();
      if (collection.isEmpty()){
         System.out.println("集合是空的");
      }
      else{
         System.out.println( "集合长度: " + size);
      }
      System.out.println();
   }
}
