package HW3;/* �ѿ� �ܾ� �˻� �ڹ� ���α׷� */

import java.util.Scanner;	// Scanner Ŭ���� �ҷ�����

class Dictionary {
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};	// �ѱ� �ܾ� �迭 
	private static String [] eng = {"love", "baby", "money", "future", "hope"}; // �ѱ� �ܾ �����ϴ� ���� �ܾ� �迭 
	
	// �˻��ڵ� �޼ҵ� �ۼ� - public static���� ���ٰ���, String�� return
	public static String kor2Eng(String word) {	
		
		for(int i=0; i<kor.length; i++){
			// ����ڷκ��� �Է¹��� �ܾ �����ϸ� 
            if(word.equals(kor[i])){   
                return eng[i];
            }
		}
		// ����ڷκ��� �Է¹��� �ܾ �迭 ���� �������� �ʴ� ���
		return "";	
	}

}

public class DicApp{
    // main �޼ҵ�()���� ���� ���� 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);	// Scanner ��ü ����
        System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");	// ���� ���� ȭ�� ��� 

        // while ���� �ݺ������� �ۼ�
        while(true){
            System.out.print("�ѱ� �ܾ�? ");	
            String text = scan.next();	// ����ڷκ��� ���ڿ� �б�
            
            // ����ڰ� ���Ḧ �Է��ϸ� ���ǹ� ����
            if(text.equals("����")){     
                System.out.println("���α׷��� �����մϴ�.");	// ���� ���� ȭ�� ��� 
                break;	// while �ݺ��� ����� 
            }
            
            String eng = Dictionary.kor2Eng(text);  // Dictionary Ŭ������ �˻� �޼ҵ� ����(��ü �������� �ʾƵ� ���� ����)
           
            if(eng == "") {
            	System.out.println(text +"��(��) ���� ������ �����ϴ�.");
            }
            else if (text.equals("�Ʊ�")|| (text.equals("�̷�"))) {
            	System.out.println(text+"�� " + eng);	// ��� ȭ�� ��� 
            }
            else {
            	System.out.println(text+"�� " + eng);
            }
            	
            
        }
        
        scan.close();	// Scanner �����ϱ�    
    }
    
}






