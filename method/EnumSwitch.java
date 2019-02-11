enum Car {
		a, b, c, d
}
public class EnumSwitch {
		public static void main (String args []) {
				Car car = Car.a;
				switch(car) {
						case a:
								System.out.println("chose a");
								break;
						case b:
								System.out.println("chose b");
								break;
						case c:
								System.out.println("chose c");
                                break;
						case d:
								System.out.println("chose d");
                                break;
						default:
								System.out.println("do not know!");
                                break;
				}
		}
}

				
