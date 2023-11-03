package string.basic;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
	   String res="";
		for(int i=str.length()-1; i>=0; i--) {
			char ch=str.charAt(i);
			res=res+ch;
		}
		if(res.equals(str)) {
			System.out.println("Polintrome");
		}
		else
			System.out.println("not polindrome");
	}
	

}
