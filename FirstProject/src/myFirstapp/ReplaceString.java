package myFirstapp;

import java.util.Scanner;

public class ReplaceString {
	public static void replacstring(String s)
	{
		if(s.length()>=3)
			System.out.println("Hello "+s+" how are you");
			else
				System.out.println("invalid user name");
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Hello how are you";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user name");
		String s=sc.next();
		/*if(s.length()>=3)
		System.out.println("Hello "+s+" how are you");
		else
			System.out.println("invalid user name");
		
	}*/
		
			ReplaceString.replacstring(s);
}}
