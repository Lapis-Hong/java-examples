/* 打印倒立的三角形 */

public class InvertedTriangle {
    public static void main(String[] args) {
         //打印倒立的三角形
        for (int m = 1; m <= 4; m++) {
            //打印空格
            for (int n = 0; n <= m; n++) {
                System.out.print(" ");
            }
            //打印*
            for (int x = 1; x <= 7 -2 * (m - 1); x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
