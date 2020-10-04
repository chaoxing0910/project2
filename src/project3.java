import java.util.Scanner;

public class project3 {

	public static void main(String[] args) {
		// 3.15 ”Œœ∑£∫≤ ∆±
		int lottery=(int)(Math.random()*1000);
		Scanner input =new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits):");
		int guess =input.nextInt();
		
		int lotteryDigit1=lottery/100;
		int lotteryDigit2=(lottery/10)%10;
		int lotteryDigit3=lottery%10;
		
		int guessDigit1=guess/100;
		int guessDigit2=(guess/10)%10;
		int guessDigit3=guess%10;
		
		System.out.print("The lottery number is:"+lottery);
		
		if(guess==lottery)
			System.out.print("Exact match:you win $10000");
		else if(guessDigit1==lotteryDigit2 && guessDigit2==lotteryDigit3 && guessDigit3==lotteryDigit1)
			System.out.print("Match all digits:you win $3000");
		else if(guessDigit1==lotteryDigit2 && guessDigit2==lotteryDigit3 && guessDigit3==lotteryDigit1)
			System.out.print("Match one digits:you win $1000");
		else
			System.out.print("Sorry,no match.");
	}
//123 132 321 312 213 231
}
