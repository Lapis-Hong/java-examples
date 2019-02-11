//以下实例演示了使用 File 类的 file.createTempFile() 方法在指定目录中创建文件
import java.io.File;
 
public class TempFile {
    public static void main(String[] args) throws Exception {
        File file = null;
        File dir = new File(".");
        file = File.createTempFile("JavaTemp", ".javatemp", dir);
        System.out.println(file.getPath());
    }
}
