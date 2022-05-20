/* 숫자 추측 게임 => do-while문 사용 */
package week5;
import java.util.Scanner;	
public class ex4 {
	
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);	
        int guess=0, trial=0;	
        int number = (int)(Math.random()*50); // 랜덤 숫자 생성

        do{
            System.out.print("숫자를 추측하여 보세요: ");
            guess = scan.nextInt();
            
            // 추측값이 랜덤 숫자보다 크면 
            if( guess > number ){
                System.out.println("DOWN");
            }
            
            // 반대로 작으면 
            else if (guess < number){	
                System.out.println("UP");
            }

            trial++; // 시도횟수 증가

        }while(guess != number);	// 추측값과 정답이 같아질 때까지 반복수행

        
        // 문자열 출력
        System.out.println("정답입니다. 시도횟수 = "+ trial);	 
        scan.close();	// Scanner 종료
        
    }
    
}
