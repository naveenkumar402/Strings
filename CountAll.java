package string.basic;

import java.util.Scanner;

public class CountAll {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		int lower=0, upper=0, spec=0, num=0;
		for(int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
			if(ch>='a' && ch<='z') {
				lower++;
			}
			else if(ch>='A' && ch<='Z') {
				upper++;
			}
			else if(ch>'0' && ch<='9') {
				num++;
			}
			else
				spec++;
		}
		System.out.println("small count is : "+lower+"\nLarge count is : "+upper);
		System.out.println("Number count is : "+num+"\nSpecial char count is : "+spec);
	}

}
