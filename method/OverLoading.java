class MyClass {
		int height;
		MyClass(int i) {
				System.out.println("含参数构造函数");
				height = i;
		}
		void info() {
				System.out.println("房子高度为 " + height + " 米");
		}
		// overloading
		void info(String s) {
				System.out.println(s + ": 房子高度为 " + height + " 米");
		}
}

public class OverLoading {
		public static void main(String[] args) {
				MyClass t = new MyClass(3);
				t.info();
				t.info("重载方法");
		}
}
