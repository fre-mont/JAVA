package HW3;

import java.util.Scanner;	// Scanner Ŭ���� �ҷ�����

public class RockScissorPaper {
	// main �޼ҵ�()���� ���� ���� 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // Scanner ��ü ����
		String str[] = {"����", "����", "��"};  // ���������� ���ڿ� �迭 ����
		int n = (int)(Math.random()*3);	 // n�� 0~2 �߿��� �����ϰ� ����
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");

		// while ���ѹݺ��� ���� 
		while(true) {
			System.out.print("���� ���� ��!>> ");
			String text = scan.next();  // ���ڿ� �б�(����� �Է°�)

			// ����ڰ� ���׸����� �Է��ϸ� ���ǹ� ����
			if(text.equals("�׸�")) {
				System.out.print("������ �����մϴ�.");
				break;	// while �ݺ��� ����� 
			}
			System.out.print("����� = "+ text + ", ��ǻ�� " +str[n] + ", ");

			// ����ڰ� ���������� ���ӿ��� ��ǻ�Ϳ� ��� ���(�� ���� ���� ���)
			if(text.equals(str[n])) {
				System.out.println("�����ϴ�.");	
			}
			// ����ڰ� �̱� ��� : And/Or �������� true�� ���ǹ� ���� 
			else if((text.equals("����") && str[n].equals("����")) || (text. equals("����")  && str[n].equals("��"))||(text.equals("��") && str[n].equals("����"))) {
				System.out.println("����ڰ� �̰���ϴ�.");
			}
			// ����ڰ� �� ��� 
			else {
				System.out.println("����ڰ� �����ϴ�.");
			}
		
			n = (int)(Math.random()*3);					
		}
		
		scan.close();
		
	}

}
