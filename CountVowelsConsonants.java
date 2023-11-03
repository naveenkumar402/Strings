package string.basic;

import java.util.Scanner;

public class CountVowelsConsonants {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		int vowel = 0, cons = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				vowel++;
			} else
				cons++;
		}
		System.out.println("Vowel count is " + vowel + "\nconsonant count is " + cons);
	}

}
//Java Program to Count Vowels
//and Consonants in the String