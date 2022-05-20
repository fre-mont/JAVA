package HW3;

import java.util.Scanner;	// Scanner Ŭ���� �ҷ�����

public class Score {

	// main �޼ҵ�()���� ���� ����
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);	// Scanner ��ü ����
        String course [] = {"java", "c++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};	// ���� �̸��� ������ �迭 ���� 
        int score [] = {95, 88, 76, 62, 55};	// ���� ������ ������ �迭 ����
        
        int count = 0;	// ����ڷκ��� �Է¹��� ���� ���� �迭�� �ִ� �� Ȯ���� ���� ���� 
        
       
        // �ݺ��� ���� 
        while(true) {
        	System.out.print("���� �̸� >>");	
            String name = scan.next();		// ����ڰ� �Է��� ����� 
        	
            // ����ڰ� "�׸�"�� �Է��ϸ� �ݺ��� ����
        	if(name.equals("�׸�")){
        		break;
        	}
        	
        	// ���� �迭�� ���Ұ���ŭ �ݺ��� ���� 
        	for(int i=0; i<course.length; i++) {
        		if(course[i].equals(name)){
        			count++;	// ����ڷκ��� �Է¹��� ���� ���� �迭�� �����ϴ� ��� count�� 1 ������Ű�� 
        			System.out.println(name + "�� ������ " + score[i]);	// �ش� ���� ���� ���� ȭ�� ��� 
        			
        		}
        	}
        	
        	// ���� count�� ���� 0�̸�(����ڰ� �Է��� ���� ���� �迭�� ���� ���) ���ǹ� ����
        	if (count == 0) {
        		System.out.println("���� �����Դϴ�.");		// ���ڿ� ȭ�� ��� 
        	}
        	
        	count = 0;	// count�� �ʱ�ȭ �� �ݺ��� �ٽ� ���� 
        }
        
        scan.close();	// Scanner ���� 

    }
    
}
