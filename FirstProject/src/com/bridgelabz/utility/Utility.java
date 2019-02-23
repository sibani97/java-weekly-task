package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {
	 static Scanner sc=new Scanner(System.in);

	public static int singleIntrgerInput()
	{
		return(sc.nextInt());
	}
	
	public static double singleDoubleInput()
	{
		return(sc.nextDouble());
	}
	public static boolean singleBooleanInput()
	{
		return(sc.nextBoolean());
	}
	public static long singleLongInput()
	{
		return(sc.nextLong());
	}
	public static byte singleByteInput()
	{
		return(sc.nextByte());
	}
	public static String singleStringInput()
	{
		return(sc.next());
	}
	public static int binsearch(int L[],int N,int item)
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
	 public static int binarystring(String[] arr,String st2)
	{
		int l=0,r=arr.length-1;
		while(l<=r)
		{
			int mid=l+(r-l)/2;
			// String x = null;
			int res = st2.compareTo(arr[mid]); 
			if(res==0)
				return mid;
			if(res>0)
				return l=mid+1;
			else
				return r=mid-1;
				
		}
		return -1;
	}
	 
	public static void bubblesort(int arr[])
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
	 public static void bubblestring(String word[])
	{
		String tem;
		for(int i=0;i<word.length;i++)
		{
			for(int j=1;j<(word.length-i);j++)
			{
				if(word[j-1].compareTo(word[j])>0)
				{
					tem=word[j-1];
					word[j-1]=word[j];
					word[j]=tem;
				}
			}
		}
		
	}
	 
	 public static void insertionsort(int arr[])
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
	 
	 
	 
	public  static void insertionsort(String arr[])
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

}
