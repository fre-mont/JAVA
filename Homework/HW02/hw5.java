package HW02;

import java.util.Scanner; // Scanner 객체 생성

public class hw5 {
    public static void main(String[] args) {    // main 메소드()에서 실행 시작
        Scanner scan = new Scanner(System.in);  // Scanner 객체 생성

        System.out.print("양의 정수를 입력하시오>> ");
        int num = scan.nextInt();   // Scanner를 이용해 정수 읽기
        
        while(num<0){   // 입력받은 정수가 음수이면 반복 작업 실행
            System.out.print("양의 정수가 아닙니다. 다시 입력하세요 : ");
            num = scan.nextInt();
        }

        System.out.println(num + "의 약수는 다음과 같습니다. ")
        ;
        for (int i=1; i<=num; i++){     // 1부터 입력받은 정수까지 반복작업 수행
            if(num%i == 0){             // 나눗셈 나머지 결과가 0이면 약수라고 판단
                System.out.print(i + " ");
            }
        }


        scan.close(); // Scanner 종료
    }
    
}
