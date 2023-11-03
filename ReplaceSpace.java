package string.basic;

import java.util.Scanner;

public class ReplaceSpacewithChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		System.out.println("enter the replace string");
		String rep = sc.next();
		String s = str.replace(" ", rep);
		System.out.println(s);
	}
}
