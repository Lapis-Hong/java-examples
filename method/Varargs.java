//以下实例创建了 sumvarargs() 方法来统计所有数字的值
public class Varargs {
		static int sumvarargs(int ... arr) {
				int sum, i;
				sum = 0;
				for (i=0; i<arr.length; i++) {
						sum += arr[i];
				}
				return sum;
		}

		public static void main(String args[]) {
				int sum = 0;
				sum = sumvarargs(new int[]{10, 12, 33});
				System.out.println("数字相加之和为: " + sum);
		}
}
				
