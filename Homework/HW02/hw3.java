package HW02;

import java.util.Scanner;   // Scanner 불러오기

public class hw3 {
    public static void main(String[] args) {  // main 메소드()에서 실행 시작
        Scanner scan = new Scanner(System.in);  // Scanner 객체 생성

        System.out.print("소문자 알파벳 하나를 입력하시오>> ");
        String text = scan.next();  // Scanner로 문자열 읽기
        char c = text.charAt(0);    // 문자열을 문자형으로 변환
        
        for (char i=c; i>='a'; i--){    // 'a'부터 입력받은 문자까지 반복 수행
            for(char j='a'; j<=i; j++){
                System.out.print(j);    // 점점 줄이기
            }
            System.out.println();
        }


        scan.close();   // Scanner 종료
    }
    
}
