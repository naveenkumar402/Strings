package string.basic;

import java.util.Scanner;

public class SumOfIntegerString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		char[] ch = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= '0' && ch[i] <= '9') 
				sum = sum + ch[i]-'0' ; 	
			}
		}
		System.out.println("sum "+sum);
	}

}
