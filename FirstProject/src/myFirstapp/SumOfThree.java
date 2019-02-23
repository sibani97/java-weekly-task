package myFirstapp;

import java.util.Scanner;

public class SumOfThree {
	public  void sumOfNumber(int a[],int length)
	{
		int i,j,k;
		for(i=0;i<length-2;i++)
		{
			for(j=i+1;j<length-1;j++)
			{
				for(k=j+1;k<length;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}	
		}

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int [size];//create array & read values one by one
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Value :");
			arr[i]=sc.nextInt();
		}
		SumOfThree t1=new SumOfThree();
		t1.sumOfNumber(arr,size);//pass the arguments to method 1
	}
}

