package language.array;
  	
//2D Array

public class ArrayExample2 {

	public static void main(String[] args) 
	{
		//initializing an 2D array
		
		int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};//3*3 matrix
		int arr2[][]= new int[3][3];
		arr2[0][0]=11;
		arr2[0][1]=22;
		arr2[0][2]=33;
		arr2[1][0]=44;
		arr2[1][1]=55;
		arr2[1][2]=66;
		arr2[2][0]=77;
		arr2[2][1]=88;
		arr2[2][2]=99;
		
		//traverse the arrays
		
		System.out.println("-----------------Traverse of 1st array ------------------");
		
		for(int i=0;i<3;i++)
		{
			for(int j= 0;j<3;j++)
			{
				System.out.print(arr1[i][j]+ " ");
			}
			
			System.out.println();
		}
		
		System.out.println("-------------------Traverse of 2nd array--------------------");
		for(int i=0;i<3;i++)
		{
			for(int j= 0;j<3;j++)
			{
				System.out.print(arr2[i][j]+ " ");
			}
			
			System.out.println();
		}
		

	}

}
