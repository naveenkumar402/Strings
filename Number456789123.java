package string.basic;

import java.util.Scanner;

//Sample Input1 : 10 1 2 3 4 5 6 7 8 9 10 4 
//Sample Output1: 5 6 7 8 9 10 1 2 3 4 
public class Number456789123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] a=new int[size];
		
		System.out.println("enetr the "+size+" elements");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("enetr the index");
		int index=sc.nextInt();
		for(int i=index; i<a.length; i++) {
			System.out.print(a[i]);
			
		}
		for(int i=0; i<index; i++) {
			System.out.print(a[i]);
		}
		
	}

}











