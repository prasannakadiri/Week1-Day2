package week1.day2;

public class ChkDuplicatesInArray {

	public static void main (String[] args)
	{
		int[] array= {2,4,3,6,2,5,8,9,6,3};
		
		int arraylenght=array.length;
		
		// get the count of an array and store it in a variable 
		
		for (int i=0;i<arraylenght;i++)
		{
			int arrcount=0;
			for (int j=i+1;j<arraylenght;j++)
			{
				if (array[i]==array[j])
					//System.out.println(i+j);
				{
					arrcount=arrcount+1;
				}
			}
			if(arrcount>0)
			System.out.println(array[i]);
		}
	}
}
