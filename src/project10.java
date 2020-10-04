import java.util.Scanner;

public class project10 {

	public static void main(String[] args) {
		// 3.27 几何：点是否在三角形内
		System.out.print("Enter a point's x- and y-coordinates: ");
		Scanner input = new Scanner(System.in);
		double x=input.nextDouble();
		double y=input.nextDouble();
		
		if((x>0&&x<200&&y>0&&y<100) && (y/(200-x)<=0.5))
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");
	}

}
