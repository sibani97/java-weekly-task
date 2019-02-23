package myFirstapp;

import java.util.Scanner;

public class TwodArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, col, i, j;
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter Number of Row for Array  : ");
		row = scan.nextInt();
		System.out.print("Enter Number of Column for Array : ");
		col = scan.nextInt();
		int arr [][]=new int [row][col];
		System.out.print("Enter " +(row*col)+ " Array Elements : ");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.print("The Array is :\n");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				System.out.print(arr[i][j]+ "  ");
			}
			System.out.println();
		}
	
		// arrd[][] = new int[10][10];
		TwodArray.arrayDouble();
		TwodArray.arrayBoolean();
	}

	public static double[][] arrayDouble() 
	{
	
	int i,j;
	int col;
	int row;

	Scanner scan=new Scanner(System.in);
	
	System.out.print("Enter Number of Row for Array  : ");
	row = scan.nextInt();
	System.out.print("Enter Number of Column for Array : ");
	col = scan.nextInt();
	//int arr [][]=new int [row][col];
	double arr[][]=new double[col][row];
	System.out.print("Enter " +(row*col)+ " Array Elements : ");
	
	for(i=0; i<row; i++)
	{
		for(j=0; j<col; j++)
		{
			arr[i][j] = scan.nextDouble();
		}
	}

	System.out.print("The Array is :\n");
	for(i=0; i<row; i++)
	{
		for(j=0; j<col; j++)
		{
			System.out.print(arr[i][j]+ "  ");
		}
		System.out.println();
	}
	return arr;



}
	public static boolean[][] arrayBoolean() 
	{
	
	int i,j;
	int col;
	int row;

	Scanner scan=new Scanner(System.in);
	
	System.out.print("Enter Number of Row for Array  : ");
	row = scan.nextInt();
	System.out.print("Enter Number of Column for Array : ");
	col = scan.nextInt();
	//int arr [][]=new int [row][col];
	boolean arr[][]=new boolean[col][row];
	System.out.print("Enter " +(row*col)+ " Array Elements : ");
	
	for(i=0; i<row; i++)
	{
		for(j=0; j<col; j++)
		{
			arr[i][j] = scan.nextBoolean();
		}
	}

	System.out.print("The Array is :\n");
	for(i=0; i<row; i++)
	{
		for(j=0; j<col; j++)
		{
			System.out.print(arr[i][j]+ "  ");
		}
		System.out.println();
	}
	return arr;

}
}
