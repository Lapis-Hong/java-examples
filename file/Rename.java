//以下实例演示了使用 File 类的 oldName.renameTo(newName) 方法来重命名文件
import java.io.File;
 
public class Rename {
    public static void main(String[] args) {
        File oldName = new File("C:/program.txt");
        File newName = new File("C:/java.txt");
        if(oldName.renameTo(newName)) {
            System.out.println("已重命名");
        } else {
            System.out.println("Error");
        }
    }
}
