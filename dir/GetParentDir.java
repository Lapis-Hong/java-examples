//以下实例演示了使用 File 类的 file.getParent() 方法来获取文件的上级目录
import java.io.File;
 
public class GetParentDir {
    public static void main(String[] args) {
        File file = new File("C:/File/demo.txt");
        String strParentDirectory = file.getParent();
        System.out.println("文件的上级目录为 : " + strParentDirectory);
    }
}
