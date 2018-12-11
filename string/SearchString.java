public class SearchString {
   public static void main(String[] args) {
      String strOrig = "Google Runoob Taobao";
      int intIndex = strOrig.indexOf("Runoob");
      if(intIndex == - 1){
         System.out.println("没有找到字符串 Runoob");
      }else{
         System.out.println("Runoob 字符串位置 " + intIndex);
      }
   }
}
