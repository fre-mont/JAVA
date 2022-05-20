/* 문자 '*' 출력 프로그램(증가) */

package week5;
import java.util.Scanner; 

public class ex2 {

    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);	
        
        System.out.print("정수 입력 >> ");
        int num = scan.nextInt();	

      
        for(int i=1; i<=num;i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();	
        }

        scan.close();
    }
    
}

