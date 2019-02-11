//以下实例演示了 for 和 foreach循环使用
public class ForForeach {
		public static void main(String[] args) {
				int [] arr = {1,2,3,4};
				forDisplay(arr);
				foreachDisplay(arr);
		}

		public static void forDisplay(int [] arr) {
				System.out.println("使用 for 循环数组");
				for (int i = 0; i < arr.length; i++) {
						System.out.print(arr[i] + " ");
				}
				System.out.println();
		}

		public static void foreachDisplay(int [] arr) {
				System.out.println("使用 foreach 循环数组");
				for (int x: arr) {
						 System.out.print(x+ " ");
				}
				System.out.println();
		}
}
