import java.util.Scanner;

public class project7 {

	public static void main(String[] args) {
		// 3.23 几何：点是否在矩形内
				Scanner input =new Scanner(System.in);
				System.out.print("Enter a point with two coordinates:");
				int x =input.nextInt();
				int y =input.nextInt();
				
				if(x<=2.5&&y<=5)
					System.out.println("Point("+x+","+y+") is in the rectangle");
				else
					System.out.println("Point("+x+","+y+") is not in the rectangle");
			}

}
