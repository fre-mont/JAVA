package HW02;

import java.util.Scanner;  // Scanner 불러 오기 

public class hw1 {  

    // main 메소드()에서 실행 시작
    public static void main(String[] args) {   
        Scanner scan = new Scanner(System.in);  // Scanner 객체 생성

        System.out.print("정수를 입력하시오>> ");
        int num = scan.nextInt();   // Scanner를 통해 정수 읽기
        
        for (int i=num; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("*");  // for반복문으로 입력 받은 정수 개수만큼 별 출력하기
            }
            System.out.println();   // 입력받은 정수 만큼 반복 수행
        }


        scan.close();   // Scanner 종료
    }
    
}
