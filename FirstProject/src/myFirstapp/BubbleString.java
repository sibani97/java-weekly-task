package myFirstapp;

import java.util.Scanner;

public class BubbleString {
	static void bubblestring(String word[])
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		String word[]=new String[size];
		System.out.println("enter the string");
		for(int i=0;i<word.length;i++)
		{
			System.out.println("enter the value");
			word[i]=sc.next();
		}
		BubbleString.bubblestring(word);
		System.out.println("after bubble sort");
		for(int i=0;i<word.length;i++)
		{
			System.out.print(""+word[i]+" ");

		}

	}

}
