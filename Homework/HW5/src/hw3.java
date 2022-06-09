/* Scanner 클래스를 사용하여 6개 학점을 ArrayList에 저장하고 학점을 점수로 변환하여 평균을 출력하는 자바프로그램 */

import java.util.*;	// 유틸리티 패키지 불러오기 

public class hw3 {
	// main 메소드()에서 실행 시작 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// Scanner 객체 생성
		System.out.print("6개의 학점을 빈 칸으로 분리 입력 (A/B/C/D/F) >>");
		
		ArrayList<String> al = new ArrayList<String>();	// 문자열만 삽입가능한 ArrayList 컬렉션 생성
		double sum = 0;	
		
		// 사용자로부터 6개의 학점을 입력받아 ArrayList에 삽입 
		for (int i=0; i<6; i++) {
			String text = scan.next();
			al.add(text);
		}
		
		
		for (int i=0; i<6; i++) {
			// ArrayList의 문자열을 문자형으로 바꾼 값을 대입하는 switch문 작성 
			switch(al.get(i).charAt(0)) {
				// ArrayList에 있는 문자를 점수로 변환하기 
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
		System.out.print(sum/al.size());	// 학점의 평균을 화면 출력 
		
		scan.close();	// Scanner 종료하기 

	}

}
