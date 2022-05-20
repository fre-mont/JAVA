/* a부터 입력받은 문자까지 출력(반복 - 감소) */
package week5;
import java.util.Scanner;	
public class ex3 {
	
	
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        System.out.print("소문자 알파벳 입력 >> ");	

        String s = scan.next();	
        char c = s.charAt(0);	
      

        for (char i=c; i>='a'; i--){
            for (char j='a'; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();	
        }
        scan.close();	
    }

}
