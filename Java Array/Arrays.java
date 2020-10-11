//An array is a collection of items stored at contiguous memory locations.
//The idea is to store multiple items of the same type together.
//This makes it easier to calculate the position of each element. 

import java.util.*;

class demo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 // here we have created an array of type integer whose variable name is arr
		int arr[];   
		
		//  assigned size of 5 to array arr 
		arr=new int[5];             
		
		//		point to remember is the starting index of array is 0 
		//		ie an array starts from 0th position 
				
		for(int i=0;i<5;i++)       
		{
			System.out.print("\nEnter element no "+i +":");
			arr[i]=sc.nextInt();   // store user input data at ith position on the array 
		}
		System.out.println("You have entered");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
}


/**
 *
---------------** OUTPUT **---------------------
Enter element no 0:10

Enter element no 1:20

Enter element no 2:30

Enter element no 3:40

Enter element no 4:50

You have entered
10
20
30
40
50

 */
