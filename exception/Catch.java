//以下实例演示了使用 catch 来处理异常的方法
public class Catch {
    public static void main (String args[]) {
        int array[]={20,20,40};
        try{
            for(int i =5;i >=0; i--) {
                System.out.println ("数组的元素值为 " +array[i]);
            }
        }
        catch (Exception e) {
            System.out.println("触发异常 : "+e);
        }
    }
}
