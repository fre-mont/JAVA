package main;	// main 패키지 

import etc.Calc;	// etc 패키지의 Calc 클래스 불러오기

public class MainApp {
	 // main() 메소드에서 실행 시작 
	 public static void main (String[] args) {
		 Calc c= new Calc(10,20);	// Calc 객체 생성 
		 System.out.println(c.sum());	// Calc 클래스의 sum() 메소드 호출 
	}


}
