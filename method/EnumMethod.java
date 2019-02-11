//以下实例演示了Enum（枚举）构造函数及方法的使用
enum Car {
		a(900), b(50), c(2);
		private int price;
		Car(int p) {
				price = p;
		}
		int getPrice() {
				return price;
		}
}

public class EnumMethod {
		public static void main(String args[]) {
				for (Car c: Car.values())
						System.out.println(c+"需要"+c.getPrice()+"美元");
		}
}
