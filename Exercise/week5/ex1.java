/* 문자 '*' 출력 프로그램(감소) */

package week5;
import java.util.Scanner;	

public class ex1 {

    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);	
        System.out.print("정수 입력 >> ");	
        
        int num = scan.nextInt();	
        
        
        for (int i = num; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                 System.out.print("*");	
            }
            System.out.println();	
        }

        scan.close();	
    }

}
