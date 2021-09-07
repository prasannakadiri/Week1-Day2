package week1.day2;

import java.util.Arrays;

public class FindSecondLargestInArray {

	public static void main(String[] args)
	{
		int[] inputarray = { 3, 2, 11, 4, 6, 7 };
		
		//sorting an array ascending order
		Arrays.sort(inputarray);

		//total length of an array 
		int arrlength = inputarray.length;
		
		//arralength-2 reverse

		System.out.println("second largest number from given array is " + inputarray[arrlength - 2]);
	}
}
