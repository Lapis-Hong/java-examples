//以下实例演示了如何使用 File 类的 list 方法来遍历指定目录下的所有目录

import java.io.*;

class ListDirs {
   public static void main(String[] args) {
      File dir = new File(".");
      File[] files = dir.listFiles();
      FileFilter fileFilter = new FileFilter() {
         public boolean accept(File file) {
            return file.isDirectory();
         }
      };
      files = dir.listFiles(fileFilter);
      System.out.println(files.length);
      if (files.length == 0) {
         System.out.println("目录不存在或它不是一个目录");
      }
      else {
         for (int i=0; i< files.length; i++) {
            File filename = files[i];
            System.out.println(filename.toString());
         }
      }
   }
}
