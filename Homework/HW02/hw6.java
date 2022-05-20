package HW02;

import java.util.Scanner;   // Scanner 불러오기 

public class hw6 {
    public static void main(String[] args) {    // main 메소드에서 실행 시작
        Scanner scan = new Scanner(System.in);  // Scanner 객체 생성

        System.out.print("양의 정수를 입력하시오>> ");
        int num = scan.nextInt();   // 정수 읽기 
        int count=0;                // 카운터값을 저장할 변수 선언 및 초기화

          for(int i=2; i<=num; i++) // 1은 소수가 아니므로 2부터 시작
          {
              for(int j=2; j<=i; j++)   
              {
                   if(i%j ==0)      // 나눠지는 수가 있으면 count값을 증가
                   {
                        count ++;
                   }    
              } 
              // 소수는 1과 자기자신으로만 나눠지므로 자기자신으로 나눠지는 경우 count가 1이된다. 
              if(count==1)
              {
                   System.out.print(i+" ");
              }
              
              count=0;  // count값을 0으로 초기화
          }

        scan.close();   // Scanner 종료
    }
    
}
