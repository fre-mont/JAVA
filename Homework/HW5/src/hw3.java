/* Scanner Ŭ������ ����Ͽ� 6�� ������ ArrayList�� �����ϰ� ������ ������ ��ȯ�Ͽ� ����� ����ϴ� �ڹ����α׷� */

import java.util.*;	// ��ƿ��Ƽ ��Ű�� �ҷ����� 

public class hw3 {
	// main �޼ҵ�()���� ���� ���� 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// Scanner ��ü ����
		System.out.print("6���� ������ �� ĭ���� �и� �Է� (A/B/C/D/F) >>");
		
		ArrayList<String> al = new ArrayList<String>();	// ���ڿ��� ���԰����� ArrayList �÷��� ����
		double sum = 0;	
		
		// ����ڷκ��� 6���� ������ �Է¹޾� ArrayList�� ���� 
		for (int i=0; i<6; i++) {
			String text = scan.next();
			al.add(text);
		}
		
		
		for (int i=0; i<6; i++) {
			// ArrayList�� ���ڿ��� ���������� �ٲ� ���� �����ϴ� switch�� �ۼ� 
			switch(al.get(i).charAt(0)) {
				// ArrayList�� �ִ� ���ڸ� ������ ��ȯ�ϱ� 
				case('A'):
					sum += 4.0;
					break;
				case('B'):
					sum += 3.0;
					break;
				case('C'):
					sum += 2.0;
					break;
				case('D'):
					sum += 1.0;
					break;
				default:
					sum += 0;
			}
					
		}
		System.out.print(sum/al.size());	// ������ ����� ȭ�� ��� 
		
		scan.close();	// Scanner �����ϱ� 

	}

}
