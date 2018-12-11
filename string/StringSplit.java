import java.util.StringTokenizer;
/*Java 中我们可以使用 StringTokennizer 设置不同分隔符来分隔字符串，默认的分隔符是：空格、制表符（\t）、换行符(\n）、回车符（\r）。
*/
public class StringSplit {
   public static void main(String args[]){
      
      String str = "www-runoob-com";
      String[] temp;
      String delimeter = "-";  // 指定分割字符
      temp = str.split(delimeter); // 分割字符串
      // 普通 for 循环
      for(int i =0; i < temp.length ; i++){
         System.out.println(temp[i]);
         System.out.println("");
      }
 
      System.out.println("------java for each循环输出的方法-----");
      String str1 = "www.runoob.com";
      String[] temp1;
      String delimeter1 = "\\.";  // 指定分割字符， . 号需要转义
      temp1 = str1.split(delimeter1); // 分割字符串
      for(String x :  temp1){
         System.out.println(x);
         System.out.println("");
      }

	  // 使用StringTokennizer 
      String str2 = "This is String , split by StringTokenizer, created by runoob";
	  System.out.println("----- 通过空格分隔 ------");
	  StringTokenizer st = new StringTokenizer(str2); 
	  while (st.hasMoreElements()) {
            System.out.println(st.nextElement());	
	  }
	  System.out.println("----- 通过逗号分隔 ------"); 
	  StringTokenizer st2 = new StringTokenizer(str2, ",");
	  while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
	  }
   }
}
