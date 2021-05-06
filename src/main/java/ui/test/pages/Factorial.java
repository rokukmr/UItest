package ui.test.pages;

public class Factorial {
	int fact=1;
	public void factorial(int number) {
		
		for(int i=number; i>=1; i--) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Factorial check = new Factorial();
		check.factorial(10);

	}

}
