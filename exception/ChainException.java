//以下实例演示了使用多个 catch 来处理链试异常

public class ChainException {
    public static void main (String args[])throws Exception  {
        int n=20,result=0;
        try{
            result=n/0;
            System.out.println("结果为"+result);
        }
        catch(ArithmeticException e){
            System.out.println("算术异常: "+e);
            try {
                throw new NumberFormatException();
            }
            catch(NumberFormatException e2) {
                System.out.println("手动抛出链试异常 : "+e2);
            }
        }
    }
}
