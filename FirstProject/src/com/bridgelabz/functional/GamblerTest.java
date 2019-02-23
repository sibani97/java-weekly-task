package com.bridgelabz.functional;

import java.util.Scanner;

public class GamblerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		int stake,goal,trials;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the stake");
		stake=sc.nextInt();
		System.out.println("enter the goal");
		goal=sc.nextInt();
		System.out.println("enter the trials");
		trials=sc.nextInt();
	        int bets = 0;        
	        int wins = 0;        

	        
	        for (int t = 0; t < trials; t++) {

	            
	            int cash = stake;
	            while (cash > 0 && cash < goal) {
	                bets++;
	                if (Math.random() < 0.5) 
	                	cash++;     // win 
	                else   
	                	cash--;     // lose 
	            }
	            if (cash == goal) 
	            	wins++;               
	        }

	        // print results
	        System.out.println(wins + " wins of " + trials);
	        System.out.println("Percent of games won = " + 100.0 * wins / trials);
	        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
	    }

	}


