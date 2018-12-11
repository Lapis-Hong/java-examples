/* 输出平行四边形 */

public class Parallelogram {
    public static void main(String[] args) {
         //外层循环 每次打出一个*
        for (int i = 1; i <=5; i++) {
            //填充空格
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            //内层循环 每次打印一个*
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
