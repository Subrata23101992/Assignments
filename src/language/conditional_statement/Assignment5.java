package language.conditional_statement;

import java.util.Scanner;

public class Assignment5 
{
	

	public static void main(String[] args) 
	{
		
		//Scanner creditScore = new Scanner(System.in);
		//Scanner income = new Scanner(System.in);
		//Scanner isEmployed = new Scanner(System.in);
		//Scanner debtToincomeRatio = new Scanner(System.in);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Customer name : ");
		String customerName= sc1.next();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the credit score :");
		int creditScore = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the Income :");
		int income = sc3.nextInt();
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Enter the isEmployed :");
		boolean isEmployed = sc4.hasNext();
		
		Scanner sc5 = new Scanner(System.in);
		System.out.println("Enter the debt To income Ratio :");
		double debtToincomeRatio = sc5.nextDouble();
		
		if (creditScore > 750)
		
			{
			System.out.println("Laon is auto approved");
			}
		
			else if (creditScore>650 && creditScore<750 )
			{ 
				if (income >= 50000)
				{
					if (isEmployed == true)
					{
						if (debtToincomeRatio <40)
						{
							System.out.println("Loan is approved");
						}
						else
						{
							System.out.println("Loan is Declined as debtToincomeRatio is greater than 40% ");
						}
					}
						
					else
					{
						System.out.println("Loan is declined as Customer is unemployed");	
					}
				}
				else
				{
				System.out.println("Loan is declined as customer's salary is less than 50000");
				}
				}
			
					
					else {
				
					System.out.println("Loan declined as Customer's credit score is less than 650");
				}
			}
			
		
			
		
		
}


