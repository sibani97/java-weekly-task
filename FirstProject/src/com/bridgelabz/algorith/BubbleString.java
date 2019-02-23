package com.bridgelabz.algorith;

//import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BubbleString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility ut=new Utility();
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=ut.singleIntrgerInput();
		String word[]=new String[size];
		System.out.println("enter the string");
		for(int i=0;i<word.length;i++)
		{
			System.out.println("enter the value");
			word[i]=ut.singleStringInput();
		}
		//BubbleString.bubblestring(word);
		ut.bubblestring(word);
		System.out.println("after bubble sort");
		for(int i=0;i<word.length;i++)
		{
			System.out.print(""+word[i]+" ");

		}

	}

}
