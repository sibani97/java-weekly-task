package com.bridgelabz.algorith;

import java.util.Scanner;

public class MergeSort {
	
	

	void mergesort(int arr[],int beg,int mid,int end)
	{
		int l = mid - beg + 1;  
		int r = end - mid;  
		int leftarr[]=new int[l];
		int rightarr[]=new int[r];
		for (int i=0; i<l; ++i)  
			leftarr[i] = arr[beg + i];  
			  
			for (int j=0; j<r; ++j)  
				rightarr[j] = arr[mid + 1+ j];  
			  
			  
			int i = 0, j = 0;  
			int k = beg;  
			while (i<l&&j<r)  
			{  
			if (leftarr[i] <= rightarr[j])  
			{  
			arr[k] = leftarr[i];  
			i++;  
			}  
			else  
			{  
			arr[k] = rightarr[j];  
			j++;  
			}  
			k++;  
			}  
			while (i<l)  
			{  
			arr[k] = leftarr[i];  
			i++;  
			k++;  
			}  
			  
			while (j<r)  
			{  
			
			arr[k] = rightarr[j];  
			j++;  
			k++;  
			}  
			}  
	

	void sort(int arr[],int beg,int end)
	{
		if(beg<end)
		{
			int mid=(beg+end)/2;
			sort(arr, beg, mid);
			sort(arr, mid+1,end);
			mergesort(arr, beg, mid, end);
		}
		System.out.println("after  sort");
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
	}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int end=size-1;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the value");
			arr[i]=sc.nextInt();
		}
			//System.out.println(arr[i]);
			MergeSort ms=new MergeSort();
			int beg = 0;
			//System.out.println("enter the end");
			
			//int end = 0;
			ms.sort(arr, 0,end);
			//ms.sort(arr, beg, end);
			/*System.out.println("after  sort");
			for(int j=0;j<arr.length;j++)
			{
				System.out.println(arr[j]);

		}*/
		}

	}


