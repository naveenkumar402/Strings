package string.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string1");
		String str1 = sc.next();
		System.out.println("enter the string2");
		String str2 = sc.next();

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		// check if the length is same
		if (str1.length() == str2.length()) {
			// convert to char array
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			// sort the char array
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			// sorted array is equal or not
			boolean res = Arrays.equals(ch1, ch2);

			if (res) {
				System.out.println(str1 + " and " + str2 + " is anagram");
			} else
				System.out.println(str1 + " and " + str2 + " is not anagram");
		} else
			System.out.println(str1 + " and " + str2 + " is not anagram");

	}
}
