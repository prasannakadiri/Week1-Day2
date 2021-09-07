package week1.day2;

public class ChkPalindrome {

	// Chk the number is palindrome or not

	public static void main(String[] args) {

		int inputnum = 454, reversenum = 0, remainder;

		// store inputnum into a variable

		int originalnum = inputnum;

		// get the reverse of inputnum and store it in a temp variable
		while (inputnum != 0) {
			remainder = inputnum % 10; // 454%10 4 is output
			reversenum = reversenum * 10 + remainder; // 0*10+4
			inputnum /= 10; // 454/10 45

		}

		//chk the inpuutnumber is same as reversednum
		if (reversenum==originalnum)
		{
			System.out.println("Given numeber is  a Palindrome");
		}
		else 
		{
			System.out.println("Given number is not a Palindrome ");
		}
	}

}
