//以下实例演示了如何使用 File 类的 list 方法来输出指定目录下的所有文件
import java.io.*;

class ListFiles {
    public static void main(String[] args) {
        File dir = new File(".");
        String[] children = dir.list();
        if (children == null) {
            System.out.println( "目录不存在或它不是一个目录");
        }
        else {
            for (int i=0; i< children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }
}
