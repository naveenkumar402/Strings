package string.basic;

import java.util.Scanner;

public class SumOfString {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("Java Program to calculate sum of integers in string");
		Scanner sc = new Scanner (System.in);
		System.out.println ("Please enter a String");
		String str = sc.nextLine();
		int len = str.length();
		for(int i=0; i<str.length(); i++){
		if(Character.isDigit(str.charAt(i))){
		sum=sum+Character.getNumericValue(str.charAt(i));
		}
		}
		System.out.println ("Sum="+sum);

	}
}

//i/p: sunil123
//o/p: 1+2+3+4=   10
