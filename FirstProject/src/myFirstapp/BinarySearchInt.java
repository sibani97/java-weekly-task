package myFirstapp;

import java.util.Arrays;
//import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInt {
	int binsearch(int L[],int N,int item)
	{
		int l=0;
		int j=N-1;
		int m;
		while(l<=j)
		{
			//int m;
			m=(l+j)/2;
			if(item==L[m])
			{
				//System.out.println("search successful"+m);
				return m;
			}
			else if (item>L[m]) 
			{
				l=m+1;
				
			//return binsearch(L, m+1, item);
			}
			else
				j=m-1;
		//	return binsearch(L, m-1, item);
		}
		
		return 0;
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the integer value");
	
	int size=sc.nextInt();
	System.out.println("enter the item no");
	int x=sc.nextInt();
	int arr[]=new int [size];//create array & read values one by one
	for(int i=0;i<arr.length;i++)
	{
		System.out.print("Enter "+(i+1)+" Value :");

		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	int n=arr.length;
	//int x=65;
	
	BinarySearchInt ob=new BinarySearchInt();
	int result=ob.binsearch(arr, n, x);
	if(result==0)
	{
		System.out.println("item is not found");
	}
	else
		System.out.println("item is found"+(result+1));


}

}
