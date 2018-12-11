/* 输出九九乘法表 */

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+"×"+i+"="+i*j+"\t");// \t 跳到下一个TAB位置
            }
            System.out.println();
        }
    }
}
