//以下实例演示了多线程异常处理方法

class MyThread extends Thread{
    public void run(){
        System.out.println("Throwing in " +"MyThread");
        throw new RuntimeException();
    }
}
class ThreadException { 
		public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
        try{
            Thread.sleep(1000);
        }
        catch (Exception x){
            System.out.println("Caught it" + x);
        }
    }
}
