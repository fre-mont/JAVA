package HW3;
import java.util.Scanner;	// Scanner Ŭ���� �ҷ�����

class Phone{
      String name;
      String tel;

      // Phone Ŭ������ �⺻ ������ 
      public Phone() {		
      }

      // �̸�(name)�� ��ȭ��ȣ(tel)�� �Ű������� �ϴ� ������ 
      public Phone(String name, String tel) {
    	     // this Ű���带 Ȱ���Ͽ� �Է°��� ������ ���� 
             this.name = name; 
             this.tel = tel;
       }

      // �̸�(name)�� ��ȯ�ϴ� getName()�޼ҵ�
      public String getName() { 
    	  return name; 
      }
    
      // ��ȭ��ȣ(tel)�� ��ȯ�ϴ� getTel()�޼ҵ�
      public String getTel() { 
    	  return tel; 
      }
}


public class PhoneBook {
	// main �޼ҵ�()���� ���� ���� 
    	public static void main(String[] args) {

        	Scanner scan = new Scanner(System.in);  // Scanner ��ü ����
        	System.out.print("�ο��� >>");
        	int number = scan.nextInt();	// Scanner�� ���� �б�

        	// �Է¹��� ������ ũ�⸸ŭ Phone ��ü �迭 ����
        	Phone list[] = new Phone[number];	

        	// for �ݺ������� �迭�� ���Ҹ��� Phone ��ü ���� 
        	for(int i=0; i<number; i++){
            		list[i] = new Phone();	// �� ����� ������ �ϳ��� Phone ��ü ���� 
       		}

        	// �迭�� ũ�⸸ŭ �ݺ��� ���� 
        	for(int i=0; i<number; i++){
            		System.out.print("�̸��� ��ȭ��ȣ (�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
            		// Scanner�� ���ڿ� �б�
            		String name = scan.next();	
            		String tel = scan.next();
            		list[i] = new Phone(name, tel);	// Phone Ŭ������ �̿��Ͽ� ��ü �迭�� �� ���ҿ� �̸��� ��ȭ��ȣ �����ϱ� 
        	}

        	System.out.println("����Ǿ����ϴ�...");	// ���ڿ� ȭ�� ��� 

        	// while ���ѹݺ��� ��� 
        	while(true){
            		int count = 0;	// �˻�Ƚ���� ������ ���� ���� �� �ʱ�ȭ 
            		System.out.print("�˻��� �̸� >>");
            		String text = scan.next();	// Scanner�� ���ڿ� �б� 
            
            		// ����ڰ� �Է��� ���ڿ��� "�׸�"�� ��� ���ǹ� ����
            		if (text.equals("�׸�")){
                		System.out.println("���α׷��� �����մϴ�.");
                		break;	// while �ݺ��� ����� 
            		}

            		// list ��ü �迭�� ũ�⸸ŭ �ݺ��� ����
            		for(int i = 0; i<list.length; i++){
            	// ����ڰ� �Է��� ���ڿ��� ��ü �迭�� name�� ���� ��� ���ǹ� ���� 
                		if(text.equals(list[i].getName())){
                    		System.out.println(text +"�� ��ȣ�� " + list[i].getTel() + "�Դϴ�.");
                    		count++;	// count�� 1 ������Ű��
                    		break;		// for �ݺ��� �����
                		}     
            		}

            		// count���� 0�� ��� ���ǹ� ���� 
            		if (count == 0){
                // ����� �Է°��� ��ü �迭�� ����� �� ����̹Ƿ� ���ڿ� ȭ�� ��� 
                		System.out.println(text +" (��)�� �����ϴ�.");
            		}

        	} 
        	scan.close();	// Scanner ���� 
        
    	}
    
}
