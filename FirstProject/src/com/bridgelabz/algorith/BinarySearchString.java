package com.bridgelabz.algorith;

//import java.util.ArrayList;
//import java.util.Scanner;

import com.bridgelabz.utility.Utility;

//import com.sun.tools.javac.util.List;

public class BinarySearchString {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility ut=new Utility();
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter the size value");
		//String st1=sc.next();
		int size=ut.singleIntrgerInput();
		
		String[] arr=new String[size];
		System.out.println("enter the string:");//user choice  n no of string
		String st1=ut.singleStringInput();//user choice string
		for(int i=1;i<arr.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Value :");
			arr[i]=ut.singleStringInput();
		}
		System.out.println("enter the item string");
		String st2=ut.singleStringInput();
		int result=ut.binarystring(arr, st2);
		if(result==-1)
			System.out.println("string is not found");
		else
			System.out.println("string is found"+" "+"index"+" "+result);
	}

}
