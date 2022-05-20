package HW02;

import java.util.Scanner;   // Scanner 불러오기

public class hw7 {
    public static void main(String[] args) {    // main() 메소드에서 실행 시작

        Scanner scan = new Scanner(System.in);  // Scanner 객체 생성

        int max = 0;    // 최대값을 저장할 변수 선언 및 초기화

        for(int i=1; i<=3; i++){    // 세 개의 숫자를 입력받을 것이므로 3번 반복
            System.out.print(i + "번째 정수를 입력하세요 : ");
            int number = scan.nextInt();    // Scanner를 이용해 정수읽기

            if(number > max){   // 만약 입력받은 정수값이 0으로 초기화한 최대값보다 크면 최대값에 정수 대입
                max = number;
            }
        }

        System.out.println("Max값은 : " + max + "입니다."); // 결과 출력하기
        

        scan.close();   // Scanner 종료
    }
    
}
