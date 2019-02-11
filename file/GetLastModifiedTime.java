//以下实例演示了使用 File 类的 file.lastModified() 方法来获取文件最后的修改时间
import java.io.File;
import java.util.Date;
 
public class GetLastModifiedTime {
    public static void main(String[] args) {
        File file = new File("Main.java");
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
    }
}
