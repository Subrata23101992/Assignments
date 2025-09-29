package language.array;

public class ArrayExample1 {

	public static void main(String[] args) 
	{
		
		//Declaration and instantiation of 1d array
		int arr1[]=new int[5];
		arr1[0]=1;
		arr1[1]=12;
		arr1[2]=13;
		arr1[3]=15;
		arr1[4]=111;
		
		System.out.println("length of the array is :"+ arr1.length);
		System.out.println("Array is :");
       //traversing an 1D array		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+ ",");
		}

	}

}
