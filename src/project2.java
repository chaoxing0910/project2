import java.util.Scanner;

public class project2 {

	public static void main(String[] args) {
		// 3.9 ºÏ—ÈISBN-10
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first 9 diits of an ISBN as integer:");
		int ISBN=input.nextInt();
		
		int d9=ISBN%10;
		int d8=(ISBN/10)%10;
		int d7=(ISBN/100)%10;
		int d6=(ISBN/1000)%10;
		int d5=(ISBN/10000)%10;
		int d4=(ISBN/100000)%10;
		int d3=(ISBN/1000000)%10;
		int d2=(ISBN/10000000)%10;
		int d1=(ISBN/100000000)%10;
		int d10=(d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
		if(d1==0) {
			if(d10==10)
				System.out.println("The ISBN-10 number is "+"0"+ISBN+"X");
			else
				System.out.println("The ISBN-10 number is "+"0"+ISBN+d10);
		}
		else {
			if(d10==10)
				System.out.println("The ISBN-10 number is "+ISBN+"X");
			else
				System.out.println("The ISBN-10 number is "+ISBN+d10);
		}
	}		
}
