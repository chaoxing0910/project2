import java.util.Scanner;

public class project5 {

	public static void main(String[] args) {
		// 3.21 科学：某天是星期几
		Scanner input =new Scanner(System.in);
		System.out.print("Enter year:(e.g,2012):");
		int year =input.nextInt();
		System.out.print("Enter month:1-12:");
		int month =input.nextInt();
		System.out.print("Enter the day of the month:1-31:");
		int day =input.nextInt();
		if (month==1) {
			month=13;
			year-=1;
		}

		if (month==2) {
			month=14;
			year-=1;
		}
		int h=(day+26*(month+1)/10+year%100+(year%100)/4+(year/100)/4+5*(year/100))%7;
		switch(h) {
		case 0:
			System.out.print("Day of the week is Saturday");
			break;
		case 1:
			System.out.print("Day of the week is Sunday");
			break;
		case 2:
			System.out.print("Day of the week is Monday");
			break;
		case 3:
			System.out.print("Day of the week is Tuesday");
			break;
		case 4:
			System.out.print("Day of the week is Wednesday");
			break;
		case 5:
			System.out.print("Day of the week is Thursday");
			break;
		case 6:
			System.out.print("Day of the week is Friday");
			break;
		}
		
	}

}
