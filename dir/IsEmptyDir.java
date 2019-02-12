//以下实例演示了使用 File 类的 file.isDirectory() 和 file.list() 方法来判断目录是否为空

import java.io.File;

public class IsEmptyDir {
		public static void main(String[] args)
    {
        File file = new File(".");  // 当前目录
        if(file.isDirectory()){
            if(file.list().length>0){
                System.out.println("目录不为空!");
            }else{
                System.out.println("目录为空!");
            }
        }else{
            System.out.println("这不是一个目录!");
        }
    }
}
