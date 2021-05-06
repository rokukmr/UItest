package ui.test.pages;

public class PrimeNumber {
	int a,b,c;
	boolean flag = false;
	public void checkPrime(int number) {
		if(number==0|| number==1) {
			flag=true;
		}
		for(int i=2; i<=number/2; i++) {
			if(number%i==0) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.print("Number is Prime number");
		} else {
			System.out.print("Number is not Prime number");
		}
	}

	public static void main(String args[]){  
		PrimeNumber check = new PrimeNumber();
		check.checkPrime(1);
	}
}
	