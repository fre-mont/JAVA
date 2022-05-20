package HW3;

import java.util.InputMismatchException;	// InputMismatchException Ŭ���� �ҷ�����
import java.util.Scanner;	// Scanner Ŭ���� �ҷ�����


public class Multiply {

	// main �޼ҵ�()���� ���� ���� 
	public static void main(String[] args) {

		   Scanner scan = new Scanner(System.in);	// Scanner ��ü ����
		      
		   // while ���ѹݺ����� Ȱ���� �ݺ��� ����
		   while (true) {	
	            System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
	            
	            // �Է°��� ������ ����� ���ܸ� ó���� try-catch �ڵ� �ۼ�
	            try{
	            	// Scanner�� �����б�
	                int n = scan.nextInt();
	                int m = scan.nextInt();
	                System.out.print(n + "x" + m + "= " + n * m);
	                break;	// ���������� ������ �а� ���� �ۼ��ϸ� �ݺ��� �����
	            }
	            // ���ܰ� �߻��ϴ� ��� ���� 
	            catch(InputMismatchException e){
	                System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");	// ���ڿ� ȭ�� ��� 
	                scan.nextLine();	// Scanner�� �Էµ� Ű�� �����ϰ� ���� line�� �б�
	            }
	            
	        } 
	        scan.close();	// Scanner �����ϱ�

	    }

	    
}
