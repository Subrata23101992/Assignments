package language.conditional_statement;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) 
	{
		
		int credit =0;
		int debit =0;
		int balance =0;
		int suspiciousCount= 0;
		
		int[] transcations = {50000,-2000,3000,-15000,-200,-300,4000,-3000};
		
		int totalTransaction = transcations.length;
		
		System.out.println("Total Transactios are : "+totalTransaction );
		
		
		
		for (int i =0;i<totalTransaction;i++)
		{
			if (transcations[i]>10000 ||transcations[i]< -10000 )
			{
				
				System.out.println("Suspicious transactions are :" + transcations[i] );
				suspiciousCount = suspiciousCount+1;
				
				
			}
			
			
			
		}
		System.out.println("Total suspicious transactions are :" + suspiciousCount);
		
		for (int i =0;i<totalTransaction;i++)
		{
			
			
			if (transcations[i]>0)
			{
				credit = credit+transcations[i];
				
		
			}
			
			else
			{
				debit = debit+ transcations[i];
			}
			
			balance = balance+transcations[i];
		}
		
		System.out.println("Total credit is :" + credit);
		System.out.println("Total debit is :"+ debit);
		System.out.println("Total bank balance is :" + balance);
		
		
		
		

	}

}
