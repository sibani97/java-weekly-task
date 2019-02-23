package myFirstapp;

import java.util.Scanner;

public class InsertionString {
	static void insertionsort(String arr[])
	{
		//int n=arr.length;
		String temp;
		for (int i=0; i<arr.length;i++) 
			
		{ 
			for(int j=i;j>0;j--)
			{
				if(arr[j].compareTo(arr[j-1])<0)
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
			
			}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		String arr[]=new String[size];
		System.out.println("enter the string");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter  Value :");
			arr[i]=sc.next();
		

	}
		insertionsort(arr);
		System.out.println("after insertion sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(""+arr[i]+"");

		}
	}
}
