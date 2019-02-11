//以下实例演示了使用 File 类的 filename.compareTo (another filename) 方法来比较两个文件路径是否在同一个目录下
import java.io.File;

public class FilePathCompare {
		public static void main(String[] args) {
				File file1 = new File("C:/File/demo1.txt");
				File file2 = new File("C:/java/demo1.txt");
				if(file1.compareTo(file2) == 0) {
						System.out.println("文件路径一致！");
				} else {
						System.out.println("文件路径不一致！");
				}
		}
}
