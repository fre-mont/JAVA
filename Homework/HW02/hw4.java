package HW02;

import java.util.Scanner;   // Scanner 불러오기

public class hw4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Scanner 객체 생성

        int guess = 0;  // 사용자가 입력한 추측값을 넣을 변수 선언 및 초기화
        int tries = 0;  // 사용자가 시도한 횟수를 저장할 변수 선언 및 초기화
        int number = (int)(Math.random()*50);   // 1~50 중에 랜던함 정수 생성하기
       
        // do-while문을 활용한 반복작업 수행
        do{
            System.out.print("숫자를 추측하여 보세요 : ");
            guess = scan.nextInt(); // 사용자가 입력한 추측 정수값 변수에 대입
            tries++;    // 한 번 시도할 때마다 시도횟수 증가

            if(number>guess){   // 만약 추측값이 정답보다 작다면 "UP" 출력
                System.out.println("UP");
            }
            else if(number<guess){  // 만약 추측값이 정답보다 크다면 "DOWN" 출력
                System.out.println("DOWN");
            }
            
        }while(guess != number);    // 정답이랑 추측값이 같아질 때까지 반복작업 진행

        System.out.println("정답입니다. 시도횟수 = "+ tries);

        scan.close();   //Scanner 종료
    }
    
}
