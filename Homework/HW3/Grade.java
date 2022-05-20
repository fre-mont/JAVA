package HW3;

import java.util.Scanner;	// Scanner Ŭ���� �ҷ�����

public class Grade {
	
	int math, science, english;	// ������ ������ ������ ���� ���� 
	int sum = 0;	// �Է¹��� ������ ���� ���� ������ ���� ���� �� �ʱ�ȭ
	
	
	// 3�� ���� ������ �Ű������� �Է¹޾� �����ϴ� Grade ������ 
	public Grade(int math, int science, int english){
		  // this Ű���带 ����Ͽ� ������ ������ �� ���� 
	     this.math = math;		
	     this.science = science;
	     this.english = english;
	     sum = math + science + english;
	}
	
	// ������ ����� ����Ͽ� �����ϴ� average() �޼ҵ�
	public int average(){
        return sum/3;
    }
	
	// main �޼ҵ�()���� ���� ���� 
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);	// Scanner ��ü ����
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >>");
		// ����ڷκ��� 3������ ������ ���� ���� �б�
		int math = scan.nextInt();	
		int science = scan.nextInt();
		int english = scan.nextInt();
		
		Grade me = new Grade(math, science, english);	// Grade ��ü ���� 
		System.out.println("����� " + me.average());		// ���� ����� ȭ�� ��� 

		scan.close();	// Scanner ����
	}

}
