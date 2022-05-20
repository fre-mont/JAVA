/*
제곱미터를 입력받아 몇 평인지 출력하는 프로그램
 */
package week3;
import java.util.Scanner;   // Scanner 클래스 이용

 public class j3week2 {
    public static void main(String[] args) {

        System.out.print("제곱미터를 입력하세요 >> ");
        Scanner scan = new Scanner(System.in);

        int square_meter = scan.nextInt(); 
        double KR_feet = square_meter / 3.305785;  // 1평은 3.305785m^2으로 계산

        System.out.println(square_meter + "m^2은 " + String.format("%.2f", KR_feet) +"평입니다.");

        scan.close();
        
    }

    
}