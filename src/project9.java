import java.util.Scanner;

public class project9 {

	public static void main(String[] args) {
		// 3.25几何：交点
		double x1, y1, x2, y2, x3, y3, x4, y4;
		double a, b, c, d, e, f, x, y, fenmu;
		
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		Scanner input = new Scanner(System.in);
		x1=input.nextDouble(); y1=input.nextDouble();x2=input.nextDouble(); y2=input.nextDouble();
		x3=input.nextDouble(); y3=input.nextDouble();x4=input.nextDouble(); y4=input.nextDouble();
		
		a=y1-y2; b =x2-x1;
		c=y3-y4; d =x4-x3;
		e=(y1-y2)*x1-(x1-x2)*y1;
		f=(y3-y4)*x3-(x3-x4)*y3;
		
		fenmu=a*d-b*c;
		
		if(fenmu != 0)
		{
			x=(e*d-b*f)/fenmu;
			y=(a*f-e*c)/fenmu;
			System.out.println("The intersecting point is at(" +x+", "+y+")");
		}
		else
			System.out.println("The two lines are parallel");
	}

}
