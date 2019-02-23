package myFirstapp;

import java.util.Scanner;

public class InsertionInteger {
	static void insertionsort(int arr[])
	{
		int n=arr.length,temp;
		for (int i=0; i<n;i++) 
		{ 
			// int key = arr[j]; 
			int j = i;

			while((j>0) && (arr[j]<arr[j-1]))
			{
				temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j=j-1;
			}

		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number as a size");
		int size=sc.nextInt();
		int[] arr=new int[size]; 
		System.out.println("enter the number");
		//int numb=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter  Value :");
			arr[i]=sc.nextInt();
			//System.out.println(arr[i]);

		}
		insertionsort(arr);
		System.out.println("after insertion sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);

		}
	}
}
