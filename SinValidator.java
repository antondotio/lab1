import java.util.Scanner;


public class SinValidator {

private int[] SIN;

private int sumDigit(int x)
{
	int result =0;
	
	while(x > 0){
		result += x % 10;
		x = x /10;
	}
	
	return result;
}

	public SinValidator(String sin) {

		SIN = new int[9];
		int i =0;
		int counter =0;
		while(i < sin.length()){

			
			if(Character.isDigit(sin.charAt(i))){
				if(counter < 9)
					SIN[counter] =(int) sin.charAt(i) - 48;
				counter++;
			}
			else{
				System.err.println("Error: Invalid input by the user");
				return;
			}
			i++;
		}
		
		if(counter != 9){
			System.err.println("Error: SIN must be 9 digits...");
			return;
		}	
	}
	
	public boolean validateSin()
	{
		int sumStepOne = SIN[0] + SIN[2] + SIN[4] + SIN[6];
		int sumOfDigits = 0;
		int [] product = new int[4];
		int [] digitSum = new int[4];
		int j = 0;

		for(int i = 1; i <= 8; i += 2){
			product[j] = SIN[i] * 2;
			digitSum[j] = sumDigit(product[j]);
			sumOfDigits += digitSum[j];
 			j++;
		 }
		 
		int sumStepFive = sumStepOne + sumOfDigits;
		int lastDigit = 10 - (sumStepFive % 10);

		if(lastDigit == SIN[8])
			return true;
		else
		 	return false;
		
	}

	public static void main(String[] args) {
		// Read user input
	
	    String sin;
		Scanner scan = new Scanner(System.in);	
		while (true)
		{
			System.out.println("Please enter your 9 digit social insurance number"
					+ " or enter quit to terminate the program: ");
			sin = scan.nextLine();
			if(sin.toUpperCase().equals("QUIT"))
				break;
			SinValidator sv = new SinValidator(sin);
			if(sv.validateSin())
				System.out.println("Yes this is a valid SIN\n");
			else
				System.out.println("No this is NOT a valid SIN\n");
			
		}
	}

}
