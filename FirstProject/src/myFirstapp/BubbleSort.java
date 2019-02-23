package myFirstapp;

import java.util.Scanner;

public class BubbleSort {
	static void bubblesort(int arr[])
	{
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(arr[j-1]>arr[j])
			{
					
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		//System.out.println("enter the number"); 
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the value");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("--__-------");
		bubblesort(arr);
		System.out.println("after bubble sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);

	}
	}
}
