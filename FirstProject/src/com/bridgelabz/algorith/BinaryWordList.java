package com.bridgelabz.algorith;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;


public class BinaryWordList {
	public static String[] fetchWord(File f)throws IOException
	{
	String word="";
	ArrayList< String>al=new ArrayList<String>();
	FileReader frd=new FileReader(f);
	int a;
	while((a=frd.read())!=-1){
		if(a==32)
		{
		al.add(word);
		word="";
		}else
		{
			word=word+String.valueOf((char)a);
		}
		
	}
	String[] str=new String[al.size()];
		al.toArray(str);
		return str;
	}

	public static void main(String[] args) //throws IOException
	{
		// TODO Auto-generated method stub
		File f=new File("/home/admin1/sibani/doco.txt");
		
		
try {
			
			String arr[] = fetchWord(f);
			for (String string : arr) {
				System.out.print(string+" ");
			}
			System.out.println("\nEnter String to search");
			String s1 = Utility.singleStringInput();
			
			//int i=BinarySearchString.binarystring(arr, s1);
			int i=Arrays.binarySearch(arr,s1);
			
			if (i < 0)
				System.out.println("not found");
			else
				System.out.println("found");

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
	}

	}


