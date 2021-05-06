package ui.test.pages;

public class Fabbonacci {
	int a=0,b=1,c;
	
	public void series(int count) {
		if(count==1) {
			System.out.print(a);
		}
		else if(count==2){
			System.out.print(a + " "+b);
		}
		else if(count>2) {
			System.out.print(a + " " + b);
			for(int i=3; i<=count; i++) {
				c= a+b;
				a=b;
				b=c;
				System.out.print(" "+ c);
			}
		}
		
	}
	public static void main(String[] args) {
		Fabbonacci seriesCheck = new Fabbonacci();
		seriesCheck.series(4);
	}

}
