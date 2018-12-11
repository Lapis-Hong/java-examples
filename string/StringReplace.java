public class StringReplace {
		public static void main(String args []){
				String str = "Hello World, Hello World";
				System.out.println(str.replace("He", "We"));
				System.out.println(str.replaceFirst("He", "We"));		
				System.out.println(str.replaceAll("He", "We"));
		}
}
