import java.io.*;
 
public class Write {
    public static void main(String[] args)  {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("runoob.txt"));
            out.write("菜鸟教程");
            out.close();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
        }
    }
}
