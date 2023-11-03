package string.basic;

// input : message
//output : msaeesg
public class Message {
	public static void main(String[] args) {
		String str = "message";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i = i + 2) {
			System.out.print(ch[i]);
		}
		for (int i = 1; i < ch.length; i = i + 2) {
			System.out.print(ch[i]);
		}
	}
}
