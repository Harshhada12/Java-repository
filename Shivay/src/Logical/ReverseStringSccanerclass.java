package Logical;

import java.util.Scanner;

public class ReverseStringSccanerclass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		String original=sc.next();
		String rev="";
		for(int i=original.length()-1;i>=0;i--) {
			 char t = original.charAt(i);
			rev=rev+t;
		}
		System.out.println("original string is"+original);
		System.out.println("reverse string is"+rev);

	}
	

}
