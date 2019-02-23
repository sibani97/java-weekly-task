package myFirstapp;

//import java.util.ArrayList;
import java.util.Scanner;

//import com.sun.tools.javac.util.List;

public class BinarySearchString {
	static int binarystring(String[] arr,String st2)
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value");
		//String st1=sc.next();
		int size=sc.nextInt();
		
		String[] arr=new String[size];
		System.out.println("enter the string:");//user choice  n no of string
		String st1=sc.next();//user choice string
		for(int i=1;i<arr.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Value :");
			arr[i]=sc .next();
		}
		System.out.println("enter the item string");
		String st2=sc.next();
		int result=binarystring(arr, st2);
		if(result==-1)
			System.out.println("string is not found");
		else
			System.out.println("string is found"+" "+"index"+" "+result);
	}

}
