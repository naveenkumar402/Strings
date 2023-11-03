package august28;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrblmSlvOnString {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		reverse();
		Anagram();
		CountVowelsandConsonants();
		Palindrome();
		frequency();
		freq();
		StringMethods();
	}
	static void reverse() {
		System.out.println("Enter the String to reverse the String");
		String s1=sc.nextLine();
		String a[]=s1.split(" ");
		for(int i=0;i<a.length;i++) {
			StringBuffer sb=new StringBuffer(a[i]);
			System.out.print(sb.reverse().toString());
		}
	}
	static void Anagram() {
		System.out.println("Enter the String to check Anagram");
		String s1=sc.next().toLowerCase();
		String s2=sc.next().toLowerCase();
		if(s1.length()==s2.length()) {
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1,ch2)) System.out.println("Anagram");
			else System.out.println("Not Anagram");
		}
		else System.out.println("Not Anagram");
	}
	static void CountVowelsandConsonants() {
		System.out.println("Enter String to count vowels and consonants");
		String str=sc.next();
		int vow=0,cons=0;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u') vow++;
			else cons++;
			
		}
		System.out.println("Vowels:"+vow+"\nConstant:"+cons);
	}
	static void Palindrome() {
		System.out.println("Enter the string to check Palindrome");
		String str=sc.next();
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		if(sb.equals(str)) System.out.println("Given String is Palindrome");
		else System.out.println("Given String is not Palindrome");
	}
	static void frequency() {
		System.out.println("Enter the String to count appearance of each charater");
		String str=sc.next();
		System.out.println("Enter character");
		char ch=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c==ch) count++;	
		}
		if(count!=0) System.out.println(ch+"="+count);
		else System.out.println("Character not found");
	}
	static void freq() {
		String s=sc.nextLine();
		String [] a=s.split(" ");
		Map<String,Integer>m=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			int count=0;
			if(m.containsKey(a[i])) {
				int val=m.get(a[i]);
				m.replace(a[i],val,val+1);
			}
			else m.put(a[i],count+1);
		}
		System.out.println(m);
	}
	static void StringMethods() {
		System.out.println("Enter the String to find duplicate characters");
		String s1=sc.nextLine();
		String s2=new String(sc.nextLine());
		System.out.println(s1==s2);
		System.out.println(s1+s2);
		System.out.println(s1.hashCode());
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.charAt(0));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.toCharArray());
		System.out.println(s1.contains("l"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toString());
		System.out.println(s1.endsWith("ome"));
		System.out.println(s1.substring(0,7));
		System.out.println(s1.startsWith("wel"));
		System.out.println(String.join("/", "29","08","2023"));
		System.out.println(s1.replace("h"," everyone"));
		String [] ch=s2.split(" ");
		for(String i:ch)
			System.out.println(i);
		
	}

}
