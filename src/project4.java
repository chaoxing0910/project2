import java.util.Scanner;

public class project4 {

	public static void main(String[] args) {
		// 3.19 计算三角形周长
		Scanner input =new Scanner(System.in);
		System.out.println("输入三角形三条边:");
		int l1 =input.nextInt();
		int l2 =input.nextInt();
		int l3 =input.nextInt();
		
		if(l1+l2>l3&&l2+l3>l1&&l1+l3>l2)
			System.out.println("三角形的周长为："+(l1+l2+l3));
		else
			System.out.println("三条边的输入不合法");
	}

}
