package string.basic;

import java.util.Scanner;

public class RepeatedChar {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		System.out.println("enter the which char is count");
		char c=sc.next().charAt(0);
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==c) {
				count++;
			}
		}
		System.out.println(count);
	}
}
