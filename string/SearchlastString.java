public class SearchlastString {
   public static void main(String[] args) {
      String strOrig = "Hello world ,Hello Runoob";
      int lastIndex = strOrig.lastIndexOf("Runoob");
      if(lastIndex == - 1){
         System.out.println("没有找到字符串 Runoob");
      }else{
         System.out.println("Runoob 字符串最后出现的位置： "+ lastIndex);
      }
   }
}
