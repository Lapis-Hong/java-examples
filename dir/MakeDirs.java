/*使用 File 类的 mkdirs() 实现递归创建目录*/

import java.io.File;
 
public class MakeDirs {
    public static void main(String[] args) {
        String directories = "a/b/c";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);
    }
}

