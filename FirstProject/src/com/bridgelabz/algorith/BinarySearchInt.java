package com.bridgelabz.algorith;

import java.util.Arrays;


import com.bridgelabz.utility.Utility;

public class BinarySearchInt {
	


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Utility ut=new Utility();
	
	
	System.out.println("enter the integer size");
	
	int size=ut.singleIntrgerInput();
	System.out.println("enter the item no");
	int x=ut.singleIntrgerInput();
	int arr[]=new int [size];//create array & read values one by one
	for(int i=0;i<arr.length;i++)
	{
		System.out.print("Enter "+(i+1)+" Value :");

		arr[i]=ut.singleIntrgerInput();
	}
	Arrays.sort(arr);
	int n=arr.length;
	//int x=65;
	
	BinarySearchInt ob=new BinarySearchInt();
	int result=ut.binsearch(arr, n, x);
	//int result=Utility.binsearch(L, N, item);
	if(result==0)
	{
		System.out.println("item is not found");
	}
	else
		System.out.println("item is found"+(result+1));


}

}
