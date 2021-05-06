package ui.test.pages;

public class ArmstrongNumber {
	int c;
	
	public void armnumber(int number) {
		int givenNumber = number;
		while(number>0) {
			int a = number%10;
			number = number/10;
		 c = c + (a*a*a);	
		 
		}
		System.out.println(c);
		if(c==givenNumber) {
			System.out.println("Number is Prime number");
		} else {
			System.out.println("Number is not Prime number");
		}
	}

	public static void main(String[] args) {
		ArmstrongNumber check = new ArmstrongNumber();
		check.armnumber(371);

	}

}
