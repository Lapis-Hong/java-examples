//以下实例演示了使用异常类的 printStack() 方法来获取堆栈信息
public class PrintStack{
    public static void main (String args[]){
        int array[]={20,20,40};
        try{
            for(int i =5; i>=0; i--) {
                System.out.println("The value of array is" +array[i]);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
