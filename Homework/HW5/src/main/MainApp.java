package main;	// main ��Ű�� 

import etc.Calc;	// etc ��Ű���� Calc Ŭ���� �ҷ�����

public class MainApp {
	 // main() �޼ҵ忡�� ���� ���� 
	 public static void main (String[] args) {
		 Calc c= new Calc(10,20);	// Calc ��ü ���� 
		 System.out.println(c.sum());	// Calc Ŭ������ sum() �޼ҵ� ȣ�� 
	}


}
