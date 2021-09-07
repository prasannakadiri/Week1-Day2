package week1.day2;

public class IsArmStrongNumber {

	// Given Num is ArmStrong or not

	// *153
	// 153= (1*1*1)+(5*5*5)+(3*3*3)

	public static void main(String[] args) {

		int inputnum = 153, originalnum, remainder, result = 0;
		
		originalnum = inputnum;

		while (originalnum != 0) 
		{
			remainder = originalnum % 10;
			
			/* step1:153%10 is 3
			step2: 15%10 is 5
			step3 10%10 is 1
			Multiplying number 3 times */
			
			result = (int) (result + Math.pow(remainder, 3));
			
			originalnum = originalnum / 10;
			/* step1; 153/10 is  15*/

		}

		if (result == inputnum) {
			System.out.println("Given Number is ArmStrong");
		} else
			System.out.println("Given Number is not ArmStrong");
	}
}
