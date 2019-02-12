//以下实例演示了使用 File 类的 dir.isDirectory() 和 dir.list() 方法来遍历目录

import java.io.File;

public class Traverse {
    public static void main(String[] argv) throws Exception {
        File dir = new File(".."); //要遍历的目录
        visitAllDirsAndFiles(dir);
    }
    public static void visitAllDirsAndFiles(File dir) {
        System.out.println(dir);
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                visitAllDirsAndFiles(new File(dir, children[i]));
            }
        }
    }
}
