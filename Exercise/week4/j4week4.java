/*
2차방정식의 근을 계산하는 프로그램
*/
package week4;
import java.util.Scanner;

public class j4week4 {
    public static void main(String[] args) {

        double a, b, c;
        double result1, result2;

        System.out.print("정수 a,b,c 입력(띄어쓰기) >> ");
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt(); 
        b = scan.nextInt(); 
        c = scan.nextInt(); 

        result1 = (-b+ Math.sqrt((b*b-4*a*c)))/2*a;
        result2 = (-b-Math.sqrt(b*b-4*a*c)) / 2*a;

        if ((b*b-4*a*c)<=0){
            System.out.println("서로 다른 실근이 없습니다.");
        }

        else {
            System.out.println("입력받은 2차방정식의 서로 다른 실근은" + result1 + "과(와)" + result2 +"입니다.");
        
        }
        scan.close();
        
    }

}

