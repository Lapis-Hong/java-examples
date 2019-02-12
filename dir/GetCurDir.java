//以下实例演示了使用 System 的 getProperty() 方法来获取当前的工作目录
class GetCurDir {
    public static void main(String[] args) {
        String curDir = System.getProperty("user.dir");
        System.out.println("你当前的工作目录为 :" + curDir);
    }
}
