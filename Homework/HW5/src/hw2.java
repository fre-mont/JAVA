/*  -1이 입력될 때까지 양의 정수를 입력받아 벡터에 저장하고 벡터를 검색하여 가장 큰 수를 출력하는 자바 프로그램 */

import java.util.*;	// 유틸리티 패키지 불러오기 

public class hw2 {
	// main 메소드()에서 실행 시작
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);	// Scanner 객체 생성 
		System.out.print("정수(-1이 입력될 때까지) >> ");
		
		int max = 0;	// 정수 최대값을 저장할 변수 선언 및 초기화
		
		Vector<Integer> v = new Vector<Integer>();	// 정수형만 삽입가능한 벡터 컬렉션 생성  

		// while 무한 반복문 작성 
		while(true) {
			int num = scan.nextInt();	// Scanner로 정수 읽기
			
			// -1값이 입력되면 while 반복문 벗어나기
			if(num == -1) {
				break;
			}
			
			v.add(num);	// 벡터 객체에 정수값 삽입하기 
		}
		
		// 벡터 v의 크기만큼 for 반복문 작성 
		for(int i=0; i<v.size(); i++) {
			// max 값보다 벡터의 i 인덱스값이 큰 경우 조건문 실행 
			if(v.get(i) > max) {
				max = v.get(i);	// max 값에 i번째 벡터값 대입 
			}
		}
		
		System.out.print("가장 큰 수는 " + max);	// 결과 화면 출력 
		scan.close();	// Scanner 종료하기
		
	}

}
