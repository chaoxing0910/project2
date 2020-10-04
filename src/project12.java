import java.util.Scanner;

public class project12 {

	public static void main(String[] args) {
		// 3.29 几何：两个圆
		 double x1,y1,r1,x2,y2,r2,d;
		 System.out.print("Enter circle1's center x-,y-coordinates,and radius: ");
		 Scanner input = new Scanner(System.in);
		 x1=input.nextDouble();y1=input.nextDouble();r1=input.nextDouble();
		 System.out.print("Enter circle2's center x-,y-coordinates,and radius: ");
		 x2=input.nextDouble();y2=input.nextDouble();r2=input.nextDouble();
		 
		 d=Math.pow((Math.pow(x1-x2,2)+Math.pow(y1-y2,2)),0.5);
		 
		 if(d<=r1+r2)
		 {
			 if(d<=r1-r2||d<=r2-r1)
				 System.out.println("circle2 is inside circle1");
			 else
				 System.out.println("circle2 overlaps circle1");
		 }
		 else
			 System.out.println("circle2 does not overlap circle1");
	}

}
