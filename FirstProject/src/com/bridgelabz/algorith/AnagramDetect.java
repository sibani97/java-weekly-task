package com.bridgelabz.algorith;
//package com.bridgelabz.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st string");
		String st1=sc.next();
		System.out.println("enter the 2nd string");
		String st2=sc.next();
		AnagramDetect.checkanagram(st1, st2);
	}
	public static void checkanagram(String st1,String st2)
	{
		int len1=st1.length();
		int len2=st1.length();
		if(len1==len2)
		{
			st1.toLowerCase();
		st1.toLowerCase();
			char[] stringarr1=st1.toCharArray(); 
			char[] stringarr2=st2.toCharArray(); 
			Arrays.sort(stringarr1);
			Arrays.sort(stringarr2);
			if(Arrays.equals(stringarr1,stringarr2))
			{
				System.out.println("anagram");

			}
			else
			{
				System.out.println("not anagram");
			}
		}
		else
		{
			System.out.println("not anagram");
		}
	}
}
