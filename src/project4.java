import java.util.Scanner;

public class project4 {

	public static void main(String[] args) {
		// 3.19 �����������ܳ�
		Scanner input =new Scanner(System.in);
		System.out.println("����������������:");
		int l1 =input.nextInt();
		int l2 =input.nextInt();
		int l3 =input.nextInt();
		
		if(l1+l2>l3&&l2+l3>l1&&l1+l3>l2)
			System.out.println("�����ε��ܳ�Ϊ��"+(l1+l2+l3));
		else
			System.out.println("�����ߵ����벻�Ϸ�");
	}

}
