package myFirstapp;

//import java.util.Arrays;
import java.util.Scanner;

public class ToBinary {
	public static void dectobinary(int no)
	{	int i=0;
	int arr[]=new int[16];
	while(no>0)
	{
		arr[i]=no%2;
		no=no/2;
		i++;

	}
	
	for(int j=i-1;j>=0;j--)
	{
		System.out.print(arr[j]);
	}
	//System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);


		System.out.println("enter the decimal no");
		int no=sc.nextInt();
		ToBinary.dectobinary(no);


	}

}
