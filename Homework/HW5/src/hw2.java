/*  -1�� �Էµ� ������ ���� ������ �Է¹޾� ���Ϳ� �����ϰ� ���͸� �˻��Ͽ� ���� ū ���� ����ϴ� �ڹ� ���α׷� */

import java.util.*;	// ��ƿ��Ƽ ��Ű�� �ҷ����� 

public class hw2 {
	// main �޼ҵ�()���� ���� ����
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);	// Scanner ��ü ���� 
		System.out.print("����(-1�� �Էµ� ������) >> ");
		
		int max = 0;	// ���� �ִ밪�� ������ ���� ���� �� �ʱ�ȭ
		
		Vector<Integer> v = new Vector<Integer>();	// �������� ���԰����� ���� �÷��� ����  

		// while ���� �ݺ��� �ۼ� 
		while(true) {
			int num = scan.nextInt();	// Scanner�� ���� �б�
			
			// -1���� �ԷµǸ� while �ݺ��� �����
			if(num == -1) {
				break;
			}
			
			v.add(num);	// ���� ��ü�� ������ �����ϱ� 
		}
		
		// ���� v�� ũ�⸸ŭ for �ݺ��� �ۼ� 
		for(int i=0; i<v.size(); i++) {
			// max ������ ������ i �ε������� ū ��� ���ǹ� ���� 
			if(v.get(i) > max) {
				max = v.get(i);	// max ���� i��° ���Ͱ� ���� 
			}
		}
		
		System.out.print("���� ū ���� " + max);	// ��� ȭ�� ��� 
		scan.close();	// Scanner �����ϱ�
		
	}

}
