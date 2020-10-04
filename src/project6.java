import java.util.Scanner;

public class project6 {

	public static void main(String[] args) {
		// 3.22 几何：点是否在圆内
		Scanner input =new Scanner(System.in);
		System.out.print("Enter a point with two coordinates:");
		int x =input.nextInt();
		int y =input.nextInt();
		
		double d=Math.sqrt(x*x+y*y);
		
		if(d<=10)
			System.out.println("Point("+x+","+y+") is in the circle");
		else
			System.out.println("Point("+x+","+y+") is not in the circle");
	}

}
